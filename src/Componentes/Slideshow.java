package Componentes;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Slideshow extends JLayeredPane {

    private final JPanel panel;
    private final Pagination pagination;
    private final Animator animator;
    private final Timer timer;
    private final MigLayout layout;
    private Component componentShow;
    private Component componentOut;
    private int currentIndex;
    private boolean next;
    private Color colorPrincipal;

    public Slideshow() {
        setOpaque(true);
        setBackground(colorPrincipal);
        layout = new MigLayout("inset 0");
        panel = new JPanel();
        panel.setBackground(colorPrincipal);
        pagination = new Pagination();
        pagination.setEventPagination(new EventPagination() {
            @Override
            public void onClick(int pageClick) {
                if (!animator.isRunning()) {
                    if (pageClick != currentIndex) {
                        timer.restart();
                        next = currentIndex < pageClick;
                        if (next) {
                            componentOut = panel.getComponent(checkNext(currentIndex));
                            currentIndex = getNext(pageClick - 1);
                            componentShow = panel.getComponent(currentIndex);
                            animator.start();
                        } else {
                            componentOut = panel.getComponent(checkBack(currentIndex));
                            currentIndex = getBack(pageClick + 1);
                            componentShow = panel.getComponent(currentIndex);
                            animator.start();
                        }
                    }
                }
            }
        });
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void begin() {
                componentShow.setVisible(true);
                componentOut.setVisible(true);
                pagination.setIndex(currentIndex);
            }

            @Override
            public void timingEvent(float fraction) {
                double width = panel.getWidth();
                int location = (int) (width * fraction);
                int locationShow = (int) (width * (1f - fraction));
                if (next) {
                    layout.setComponentConstraints(componentShow, "pos " + locationShow + " 0 100% 100%, w 100%!");
                    layout.setComponentConstraints(componentOut, "pos -" + location + " 0 " + (width - location) + " 100%");
                } else {
                    layout.setComponentConstraints(componentShow, "pos -" + locationShow + " 0 " + (width - locationShow) + " 100%");
                    layout.setComponentConstraints(componentOut, "pos " + location + " 0 100% 100%, w 100%!");
                }
                pagination.setAnimation(fraction);
                panel.revalidate();
            }

            @Override
            public void end() {
                componentOut.setVisible(false);
                layout.setComponentConstraints(componentShow, "pos 0 0 100% 100%, width 100%");
            }
        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        setLayer(pagination, JLayeredPane.POPUP_LAYER);
        panel.setLayout(layout);
        setLayout(new MigLayout("fill, inset 0", "[fill, center]", "3[fill]3"));
        add(pagination, "pos 0.5al 1al n n");
        add(panel, "w 100%-6!");
        timer = new Timer(3000, (ActionEvent ae) -> {
            next();
        });
    }

    public void initSlideshow(Component... coms) {
        if (coms.length >= 2) {
            for (Component com : coms) {
                com.setVisible(false);
                panel.add(com, "pos 0 0 0 0");
            }
            if (panel.getComponentCount() > 0) {
                componentShow = panel.getComponent(0);
                componentShow.setVisible(true);
                layout.setComponentConstraints(componentShow, "pos 0 0 100% 100%");
            }
            pagination.setTotalPage(panel.getComponentCount());
            pagination.setCurrentIndex(0);
            timer.start();
        }
    }

    public void initSlideshow(ArrayList<Component> coms) {
        if (coms.size() >= 2) {
            for (Component com : coms) {
                com.setVisible(false);
                panel.add(com, "pos 0 0 0 0");
            }
            if (panel.getComponentCount() > 0) {
                componentShow = panel.getComponent(0);
                componentShow.setVisible(true);
                layout.setComponentConstraints(componentShow, "pos 0 0 100% 100%");
            }
            pagination.setTotalPage(panel.getComponentCount());
            pagination.setCurrentIndex(0);
            timer.start();
        }
    }

    public void next() {
        if (!animator.isRunning()) {
            timer.restart();
            next = true;
            currentIndex = getNext(currentIndex);
            componentShow = panel.getComponent(currentIndex);
            componentOut = panel.getComponent(checkNext(currentIndex - 1));
            animator.start();
        }
    }

    public void back() {
        if (!animator.isRunning()) {
            timer.restart();
            next = false;
            currentIndex = getBack(currentIndex);
            componentShow = panel.getComponent(currentIndex);
            componentOut = panel.getComponent(checkBack(currentIndex + 1));
            animator.start();
        }
    }

    private int getNext(int index) {
        if (index == panel.getComponentCount() - 1) {
            return 0;
        } else {
            return index + 1;
        }
    }

    private int checkNext(int index) {
        if (index == -1) {
            return panel.getComponentCount() - 1;
        } else {
            return index;
        }
    }

    private int getBack(int index) {
        if (index == 0) {
            return panel.getComponentCount() - 1;
        } else {
            return index - 1;
        }
    }

    private int checkBack(int index) {
        if (index == panel.getComponentCount()) {
            return 0;
        } else {
            return index;
        }
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public void setColorPrincipal(Color colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }
}

class Pagination extends JComponent {

    private int index;
    private int currentIndex;
    private EventPagination event;

    public void setEventPagination(EventPagination event) {
        this.event = event;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
        Item item = (Item) getComponent(currentIndex);
        item.setAlpha(1f);
    }

    public void setTotalPage(int totalPage) {
        removeAll();
        for (int i = 0; i < totalPage; i++) {
            add(new Item(i, event));
        }
        repaint();
        revalidate();
    }

    public void setAnimation(float alpha) {
        Item item = (Item) getComponent(index);
        item.setAlpha(alpha);
        Item itemOut = (Item) getComponent(currentIndex);
        itemOut.setAlpha(1f - alpha);
        if (alpha == 1) {
            currentIndex = index;
        }
    }

    public Pagination() {
        setLayout(new MigLayout("inset 15", "[center]10[center]"));
    }

    private class Item extends JButton {

        private float alpha;

        public void setAlpha(float alpha) {
            this.alpha = alpha;
            repaint();
        }

        public Item(int index, EventPagination event) {
            setContentAreaFilled(false);
            setBorder(new EmptyBorder(5, 5, 5, 5));
            setBackground(new Color(110, 110, 110));
            setCursor(new Cursor(Cursor.HAND_CURSOR));
            addActionListener((ActionEvent ae) -> {
                event.onClick(index);
            });
        }

        @Override
        public void paint(Graphics grphcs) {
            super.paint(grphcs);
            int width = getWidth();
            int height = getHeight();
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
            g2.setColor(getBackground());
            g2.fillOval(0, 0, width, height);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            g2.setColor(new Color(226, 68, 88));
            g2.fillOval(0, 0, width, height);
            g2.dispose();
        }
    }
}

interface EventPagination {

    public void onClick(int pageClick);
}

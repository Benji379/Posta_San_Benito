package Componentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalTextFieldUI;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class TextFieldSuggestion extends JTextField {

    private TextFieldSuggestionUI textUI;

    public TextFieldSuggestion() {
        textUI = new TextFieldSuggestionUI(this);

        setUI(textUI);
    }

    public void addItemSuggestion(String text) {
        textUI.getItems().add(text);
    }

    public void addItemSuggestion(String... texts) {
        for (String txt : texts) {
            textUI.getItems().add(txt);
        }
    }

    public void removeItemSuggestion(String text) {
        textUI.getItems().remove(text);
    }

    public void clearItemSuggestion() {
        textUI.getItems().clear();
    }

    public void setRound(int round) {
        textUI.setRound(round);
    }

    public int getRound() {
        return textUI.getRound();
    }

}

class TextFieldSuggestionUI extends MetalTextFieldUI {

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        border.setRound(round);
        textfield.repaint();
    }

    private JTextField textfield;
    private Border border;
    private int round = 15;
    private List<String> items = new ArrayList<>();

    public TextFieldSuggestionUI(JTextField textfield) {
        this.textfield = textfield;
        border = new Border(10);
        border.setRound(round);
        textfield.setBorder(border);
        textfield.setOpaque(false);
        textfield.setSelectedTextColor(Color.BLACK);
        textfield.setSelectionColor(new Color(220, 220, 220));
        textfield.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent fe) {
                border.setColor(new Color(220, 220, 220));
                textfield.repaint();
            }

            @Override
            public void focusLost(FocusEvent fe) {
                border.setColor(new Color(173,221,219));
                textfield.repaint();
            }
        });
        AutoCompleteDecorator.decorate(textfield, items, false);
    }

    @Override
    protected void paintBackground(Graphics grphcs) {
        if (textfield.isOpaque()) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(textfield.getBackground());
            g2.fillRoundRect(0, 0, textfield.getWidth(), textfield.getHeight(), round, round);
            g2.dispose();
        }
    }

    private class Border extends EmptyBorder {

        public int getRound() {
            return round;
        }

        public void setRound(int round) {
            this.round = round;
        }

        public Color getFocusColor() {
            return focusColor;
        }

        public void setFocusColor(Color focusColor) {
            this.focusColor = focusColor;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        private Color focusColor = new Color(96, 255, 248);
        private Color color = new Color(173,221,219);
        private int round;

        public Border(int border) {
            super(border, border, border, border);
        }

        public Border() {
            this(5);
        }

        @Override
        public void paintBorder(Component cmpnt, Graphics grphcs, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (cmpnt.isFocusOwner()) {
                g2.setColor(focusColor);
            } else {
                g2.setColor(color);
            }
            g2.drawRoundRect(x, y, width - 1, height - 1, round, round);
            g2.dispose();
        }
    }
}

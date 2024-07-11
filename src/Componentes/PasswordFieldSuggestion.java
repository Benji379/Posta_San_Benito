package Componentes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class PasswordFieldSuggestion extends JPasswordField {

    private PasswordFieldSuggestionUI passwordUI;

    public PasswordFieldSuggestion() {
        passwordUI = new PasswordFieldSuggestionUI(this);
        setUI(passwordUI);
    }

    public void setRound(int round) {
        passwordUI.setRound(round);
    }

    public int getRound() {
        return passwordUI.getRound();
    }
}

class PasswordFieldSuggestionUI extends BasicPasswordFieldUI {

    private JPasswordField passwordField;
    private Border border;
    private int round = 15;

    public PasswordFieldSuggestionUI(JPasswordField passwordField) {
        this.passwordField = passwordField;
        border = new Border(10);
        border.setRound(round);
        passwordField.setBorder(border);
        passwordField.setOpaque(false);
        passwordField.setSelectedTextColor(Color.BLACK);
        passwordField.setSelectionColor(new Color(220, 220, 220));
        passwordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent fe) {
                border.setColor(new Color(220, 220, 220));
                passwordField.repaint();
            }

            @Override
            public void focusLost(FocusEvent fe) {
                border.setColor(new Color(173, 221, 219));
                passwordField.repaint();
            }
        });
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        border.setRound(round);
        passwordField.repaint();
    }

    @Override
    protected void paintBackground(Graphics grphcs) {
        if (passwordField.isOpaque()) {
            Graphics2D g2 = (Graphics2D) grphcs.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(passwordField.getBackground());
            g2.fillRoundRect(0, 0, passwordField.getWidth(), passwordField.getHeight(), round, round);
            g2.dispose();
        }
    }

    private class Border extends EmptyBorder {

        private Color focusColor = new Color(96, 255, 248);
        private Color color = new Color(173, 221, 219);
        private int round;

        public Border(int border) {
            super(border, border, border, border);
        }

        public Border() {
            this(5);
        }

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

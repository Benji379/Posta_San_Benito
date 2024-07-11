package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModernLogin extends JFrame {

    public ModernLogin() {
        // Configuración del marco principal
        setTitle("Modern Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(60, 63, 65));
        mainPanel.setLayout(new BorderLayout());
        getContentPane().add(mainPanel);

        // Panel de encabezado
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(43, 43, 43));
        JLabel titleLabel = new JLabel("Welcome");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(titleLabel);
        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Panel central para campos de entrada
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(new Color(60, 63, 65));
        centerPanel.setLayout(new GridBagLayout());
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;

        // Etiqueta de nombre de usuario
        JLabel userLabel = new JLabel("Username:");
        userLabel.setForeground(Color.WHITE);
        centerPanel.add(userLabel, gbc);

        // Campo de texto de nombre de usuario
        gbc.gridx = 1;
        JTextField userField = new JTextField(15);
        centerPanel.add(userField, gbc);

        // Etiqueta de contraseña
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel passLabel = new JLabel("Password:");
        passLabel.setForeground(Color.WHITE);
        centerPanel.add(passLabel, gbc);

        // Campo de texto de contraseña
        gbc.gridx = 1;
        JPasswordField passField = new JPasswordField(15);
        centerPanel.add(passField, gbc);

        // Botón de inicio de sesión
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton loginButton = new JButton("Login");
        loginButton.setBackground(new Color(43, 43, 43));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        centerPanel.add(loginButton, gbc);

        // Acción del botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());
                if (username.equals("admin") && password.equals("admin")) {
                    JOptionPane.showMessageDialog(ModernLogin.this, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(ModernLogin.this, "Login Failed");
                }
            }
        });

        // Mostrar la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ModernLogin();
            }
        });
    }
}

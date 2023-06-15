package Percobaan;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signupButton;

    private Login login;

    public MainFrame() {
        login = new Login();

        setTitle("Login & Signup");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        signupButton = new JButton("Daftar");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(signupButton);

        loginButton.addActionListener(this);
        signupButton.addActionListener(this);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            login.setUsername(username);
            login.setPassword(password);

            if (login.authenticate()) {
                JOptionPane.showMessageDialog(this, "Login Berhasil :)");
            } else {
                JOptionPane.showMessageDialog(this, "Login Gagal");
            }
        } else if (e.getSource() == signupButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            SignUp.signUp(username, password);
            JOptionPane.showMessageDialog(this, "Signup berhasil!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
}

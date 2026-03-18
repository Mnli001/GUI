import javax.swing.*;
import java.awt.event.*;

public class LoginGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Screen");

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);

        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 150, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 30);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(150, 100, 150, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            }
        });

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(loginButton);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

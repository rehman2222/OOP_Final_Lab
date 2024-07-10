package passwordcheckergui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordCheckerGUI extends JFrame implements ActionListener {
    JTextField passwordField;
    JButton checkButton;
    JLabel resultLabel;

    public PasswordCheckerGUI() {
        super("Password Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new GridLayout(4, 1));
        JLabel passwordLabel = new JLabel("Enter Password:");
        add(passwordLabel);

        passwordField = new JTextField();
        add(passwordField);
        checkButton = new JButton("Check");
        checkButton.addActionListener(this);
        add(checkButton);
        resultLabel = new JLabel("");
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == checkButton) {
            String password = passwordField.getText();
            if (isValidPassword(password)) {
                resultLabel.setText("Valid Password");
            } else {
                resultLabel.setText("Invalid Password");
            }
        }
    }

    private boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }

        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }
 public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PasswordCheckerGUI());
    }
}

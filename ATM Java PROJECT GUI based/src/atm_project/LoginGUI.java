package atm_project;
 
import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;

public class LoginGUI {
  static Map<String, User> users = new HashMap<>();

    public LoginGUI() {
        loadUsers();

        JFrame frame = new JFrame("ATM_Interface");
        frame.setSize(958, 590);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setForeground(new Color(0, 0, 139));
        userLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        userLabel.setBounds(243, 249, 98, 25);
        frame.getContentPane().add(userLabel);

        JTextField userText = new JTextField();
        userText.setBackground(new Color(176, 224, 230));
        userText.setForeground(new Color(255, 0, 0));
        userText.setBounds(370, 249, 200, 25);
        frame.getContentPane().add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(new Color(0, 0, 205));
        passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        passwordLabel.setBounds(243, 284, 98, 25);
        frame.getContentPane().add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBackground(new Color(176, 224, 230));
        passwordText.setForeground(new Color(255, 0, 0));
        passwordText.setBounds(370, 284, 200, 25);
        frame.getContentPane().add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setForeground(new Color(0, 128, 0));
        loginButton.setBackground(new Color(169, 169, 169));
        loginButton.setFont(new Font("Footlight MT Light", Font.BOLD, 18));
        loginButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        loginButton.addActionListener(new ActionListener() {
        });
        loginButton.setBounds(261, 348, 133, 48);
        frame.getContentPane().add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBackground(new Color(169, 169, 169));
        registerButton.setForeground(new Color(34, 139, 34));
        registerButton.setFont(new Font("Footlight MT Light", Font.BOLD, 18));
        registerButton.addActionListener(new ActionListener() {
        });
        registerButton.setBounds(431, 348, 121, 48);
        frame.getContentPane().add(registerButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBackground(new Color(169, 169, 169));
        exitButton.setForeground(new Color(34, 139, 34));
        exitButton.setFont(new Font("Footlight MT Light", Font.BOLD, 18));
        exitButton.setBounds(587, 348, 121, 48);
        exitButton.addActionListener(new ActionListener() {
        });
        frame.getContentPane().add(exitButton);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(128, 0, 0));
        panel.setBounds(0, 0, 944, 123);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("CENTRAL DHAKA BANK");
        lblNewLabel.setForeground(new Color(250, 250, 210));
        lblNewLabel.setFont(new Font("Centaur", Font.BOLD, 24));
        lblNewLabel.setBounds(313, 46, 365, 41);
        panel.add(lblNewLabel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(119, 136, 153));
        panel_1.setBounds(0, 310, 121, 243);
        frame.getContentPane().add(panel_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(47, 79, 79));
        panel_2.setBounds(115, 432, 829, 121);
        frame.getContentPane().add(panel_2);
        panel_2.setLayout(null);
        
        JPanel panel_6 = new JPanel();
        panel_6.setBackground(new Color(0, 0, 139));
        panel_6.setBounds(64, 0, 77, 56);
        panel_2.add(panel_6);
        
        JPanel panel_7 = new JPanel();
        panel_7.setBackground(new Color(25, 25, 112));
        panel_7.setBounds(142, 57, 90, 64);
        panel_2.add(panel_7);
        
        JPanel panel_8 = new JPanel();
        panel_8.setBackground(new Color(0, 0, 0));
        panel_8.setBounds(232, 0, 90, 56);
        panel_2.add(panel_8);
        
        JPanel panel_9 = new JPanel();
        panel_9.setBackground(new Color(0, 0, 0));
        panel_9.setBounds(324, 57, 98, 64);
        panel_2.add(panel_9);
        
        JPanel panel_10 = new JPanel();
        panel_10.setBackground(new Color(0, 0, 0));
        panel_10.setBounds(428, 0, 98, 64);
        panel_2.add(panel_10);
        
        JPanel panel_11 = new JPanel();
        panel_11.setBackground(new Color(0, 139, 139));
        panel_11.setBounds(524, 57, 112, 64);
        panel_2.add(panel_11);
        
        JPanel panel_12 = new JPanel();
        panel_12.setBackground(new Color(0, 139, 139));
        panel_12.setBounds(637, 0, 98, 64);
        panel_2.add(panel_12);
        
        JPanel panel_13 = new JPanel();
        panel_13.setBackground(new Color(0, 139, 139));
        panel_13.setBounds(737, 54, 92, 67);
        panel_2.add(panel_13);
        
        JPanel panel_14 = new JPanel();
        panel_14.setBackground(new Color(0, 0, 139));
        panel_14.setBounds(0, 57, 70, 64);
        panel_2.add(panel_14);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(128, 0, 0));
        panel_3.setBounds(115, 366, 62, 68);
        frame.getContentPane().add(panel_3);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(0, 0, 139));
        panel_4.setBounds(198, 119, 530, 60);
        frame.getContentPane().add(panel_4);
        panel_4.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("ATM MANAGEMENT");
        lblNewLabel_1.setForeground(new Color(176, 224, 230));
        lblNewLabel_1.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
        lblNewLabel_1.setBounds(114, 10, 333, 40);
        panel_4.add(lblNewLabel_1);
        
        JPanel panel_5 = new JPanel();
        panel_5.setBackground(new Color(72, 61, 139));
        panel_5.setBounds(781, 310, 163, 122);
        frame.getContentPane().add(panel_5);

        loginButton.addActionListener((ActionEvent e) -> {
            String username = userText.getText();
            String password = new String(passwordText.getPassword());
            
            User user = users.get(username);
            if (user != null && user.checkPassword(password)) {
                frame.dispose();
                ATMGUI atmgui = new ATMGUI(user);
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid username or password");
            }
        });

        registerButton.addActionListener((ActionEvent e) -> {
            JFrame registerFrame = new JFrame("Register");
            registerFrame.setSize(350, 300);
            registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            registerFrame.setLayout(null);
            
            JLabel regUserLabel = new JLabel("New Username:");
            regUserLabel.setBounds(30, 30, 100, 25);
            registerFrame.add(regUserLabel);
            
            JTextField regUserText = new JTextField();
            regUserText.setBounds(150, 30, 150, 25);
            registerFrame.add(regUserText);
            
            JLabel regPasswordLabel = new JLabel("New Password:");
            regPasswordLabel.setBounds(30, 70, 100, 25);
            registerFrame.add(regPasswordLabel);
            
            JPasswordField regPasswordText = new JPasswordField();
            regPasswordText.setBounds(150, 70, 150, 25);
            registerFrame.add(regPasswordText);
            
            JLabel initialBalanceLabel = new JLabel("Initial Balance:");
            initialBalanceLabel.setBounds(30, 110, 100, 25);
            registerFrame.add(initialBalanceLabel);
            
            JTextField initialBalanceText = new JTextField();
            initialBalanceText.setBounds(150, 110, 150, 25);
            registerFrame.add(initialBalanceText);
            
            JButton createAccountButton = new JButton("Create Account");
            createAccountButton.setBounds(100, 150, 150, 25);
            registerFrame.add(createAccountButton);
            
            createAccountButton.addActionListener((ActionEvent e1) -> {
                String newUsername = regUserText.getText();
                String newPassword = new String(regPasswordText.getPassword());
                double initialBalance;
                
                try {
                    initialBalance = Double.parseDouble(initialBalanceText.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(registerFrame, "Invalid balance amount");
                    return;
                }
                
                if (users.containsKey(newUsername)) {
                    JOptionPane.showMessageDialog(registerFrame, "Username already exists");
                } else {
                    User newUser = new User(newUsername, newPassword, initialBalance);
                    users.put(newUsername, newUser);
                    newUser.saveUser();
                    JOptionPane.showMessageDialog(registerFrame, "Account created successfully");
                    registerFrame.dispose();
                }
            });
            
            registerFrame.setVisible(true);
        });
        
        exitButton.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }

    private void loadUsers() {
        List<User> loadedUsers = User.loadUsers();
        for (User user : loadedUsers) {
            users.put(user.getUsername(), user);
        }
    }



public static void deleteUser(User user) {
    System.out.println("Deleting user: " + user.getUsername()); // Debug print
    user.deleteUser(); // Delete user data files
    saveUsers(); // Save updated user data
}

private static void saveUsers() {
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt"))) {
        for (User user : users.values()) {
            writer.write(user.getUsername() + "," + user.getPassword() + "," + user.getAccount().checkBalance());
            writer.newLine();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
  }

}

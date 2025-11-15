
package atm_project;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Color;
import javax.swing.border.BevelBorder;



public class ATMGUI {
  private User user;

    public ATMGUI(User user) {
        this.user = user;
          JFrame frame = new JFrame("ATM Interface");
          frame.getContentPane().setBackground(new Color(220, 220, 220));
        frame.setSize(1223, 716);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true); // Set frame to be sizable
        frame.getContentPane().setLayout(null);

        JLabel balanceLabel = new JLabel("Balance: $" + user.getAccount().checkBalance());
        balanceLabel.setFont(new Font("Engravers MT", Font.BOLD, 16));
        balanceLabel.setBounds(298, 266, 294, 30);
        frame.getContentPane().add(balanceLabel);

        JButton depositButton = new JButton("Deposit");
        depositButton.setForeground(new Color(34, 139, 34));
        depositButton.setBackground(new Color(95, 158, 160));
        depositButton.setFont(new Font("Calisto MT", Font.BOLD, 16));
        depositButton.setBounds(677, 219, 137, 50);
        frame.getContentPane().add(depositButton);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setForeground(new Color(224, 255, 255));
        withdrawButton.setBackground(new Color(95, 158, 160));
        withdrawButton.setFont(new Font("Calisto MT", Font.BOLD, 15));
        withdrawButton.setBounds(866, 237, 125, 64);
        frame.getContentPane().add(withdrawButton);

        JButton transferButton = new JButton("Transfer");
        transferButton.setForeground(new Color(34, 139, 34));
        transferButton.setBackground(new Color(95, 158, 160));
        transferButton.setFont(new Font("Calisto MT", Font.BOLD, 15));
        transferButton.setBounds(677, 365, 141, 50);
        frame.getContentPane().add(transferButton);

        JButton checkBalanceButton = new JButton("Check Balance");
        checkBalanceButton.setForeground(new Color(34, 139, 34));
        checkBalanceButton.setBackground(new Color(95, 158, 160));
        checkBalanceButton.setFont(new Font("Calisto MT", Font.BOLD, 14));
        checkBalanceButton.setBounds(681, 284, 137, 50);
        frame.getContentPane().add(checkBalanceButton);

        JButton historyButton = new JButton("Transaction History");
        historyButton.setForeground(new Color(224, 255, 255));
        historyButton.setBackground(new Color(95, 158, 160));
        historyButton.setFont(new Font("Calisto MT", Font.BOLD, 15));
        historyButton.setBounds(866, 330, 137, 64);
        frame.getContentPane().add(historyButton);

        JTextField amountField = new JTextField();
        amountField.setBackground(new Color(230, 230, 250));
        amountField.setBounds(336, 317, 200, 30);
        frame.getContentPane().add(amountField);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        amountLabel.setBounds(240, 313, 86, 30);
        frame.getContentPane().add(amountLabel);

        JTextField transferField = new JTextField();
        transferField.setBackground(new Color(230, 230, 250));
        transferField.setBounds(336, 357, 200, 30);
        frame.getContentPane().add(transferField);

        JLabel transferLabel = new JLabel("Target Username:");
        transferLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
        transferLabel.setBounds(193, 353, 137, 30);
        frame.getContentPane().add(transferLabel);

        JButton backButton = new JButton("Back");
        backButton.setForeground(new Color(176, 196, 222));
        backButton.setBackground(new Color(0, 0, 139));
        backButton.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
        backButton.setBounds(141, 439, 150, 50);
        frame.getContentPane().add(backButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.setForeground(new Color(176, 196, 222));
        cancelButton.setBackground(new Color(0, 0, 139));
        cancelButton.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
        cancelButton.setBounds(359, 442, 120, 45);
        frame.getContentPane().add(cancelButton);
       
        JButton deleteButton = new JButton("Delete Account");
        deleteButton.setForeground(new Color(176, 196, 222));
        deleteButton.setBackground(new Color(0, 0, 139));
        deleteButton.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 18));
        deleteButton.setBounds(536, 439, 170, 50);
        frame.getContentPane().add(deleteButton);
        
        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(0, 582, 571, 97);
        frame.getContentPane().add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_1.setBackground(new Color(169, 169, 169));
        panel_1.setBounds(571, 582, 638, 97);
        frame.getContentPane().add(panel_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(128, 128, 128));
        panel_2.setBounds(298, 512, 520, 70);
        frame.getContentPane().add(panel_2);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_3.setBackground(new Color(112, 128, 144));
        panel_3.setForeground(Color.GRAY);
        panel_3.setBounds(0, 406, 93, 176);
        frame.getContentPane().add(panel_3);
        
        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_4.setBackground(new Color(112, 128, 144));
        panel_4.setBounds(1094, 406, 115, 176);
        frame.getContentPane().add(panel_4);
        
        JPanel panel_5 = new JPanel();
        panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel_5.setBackground(new Color(47, 79, 79));
        panel_5.setBounds(0, 0, 1209, 170);
        frame.getContentPane().add(panel_5);
        panel_5.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("DHAKA CENTRAL BANK ");
        lblNewLabel.setForeground(new Color(175, 238, 238));
        lblNewLabel.setFont(new Font("Centaur", Font.BOLD, 25));
        lblNewLabel.setBounds(203, 71, 390, 48);
        panel_5.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\financial-institutions-clipart-7-3595790698.jpg"));
        lblNewLabel_1.setBounds(10, 0, 200, 170);
        panel_5.add(lblNewLabel_1);

         depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount;
                try {
                    amount = Double.parseDouble(amountField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid amount");
                    return;
                }
                if (amount <= 0) {
                    JOptionPane.showMessageDialog(frame, "Amount must be positive");
                    return;
                }
                user.getAccount().deposit(amount);
                updateTransaction("Deposit", amount);
                balanceLabel.setText("Balance: $" + user.getAccount().checkBalance());
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount;
                try {
                    amount = Double.parseDouble(amountField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid amount");
                    return;
                }
                if (amount <= 0) {
                    JOptionPane.showMessageDialog(frame, "Amount must be positive");
                    return;
                }
                user.getAccount().withdraw(amount);
                updateTransaction("Withdraw", amount);
                balanceLabel.setText("Balance: $" + user.getAccount().checkBalance());
            }
        });

        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String targetUsername = transferField.getText();
                User targetUser = LoginGUI.users.get(targetUsername);
                if (targetUser != null) {
                    double amount;
                    try {
                        amount = Double.parseDouble(amountField.getText());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid amount");
                        return;
                    }
                    if (amount <= 0) {
                        JOptionPane.showMessageDialog(frame, "Amount must be positive");
                        return;
                    }
                    if (user.getAccount().checkBalance() >= amount) {
                        user.getAccount().withdraw(amount);
                        targetUser.getAccount().deposit(amount);
                        updateTransaction("Transfer to " + targetUsername, -amount);
                        balanceLabel.setText("Balance: $" + user.getAccount().checkBalance());
                        // Record the transaction for the recipient as well
                        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                        Transaction transaction = new Transaction("Transfer from " + user.getUsername(), amount, targetUser.getAccount().checkBalance(), timestamp);
                        targetUser.addTransaction(transaction);
                        targetUser.saveTransactionHistory();
                        JOptionPane.showMessageDialog(frame, "Transfer successful");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Insufficient funds");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Target user not found");
                }
            }
        });

        checkBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Current Balance: $" + user.getAccount().checkBalance());
            }
        });

        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder history = new StringBuilder();
                for (Transaction transaction : user.getTransactionHistory()) {
                    history.append(transaction.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(frame, history.toString());
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current window (ATM interface)
                frame.dispose();
                // You may want to open the previous screen if applicable
                LoginGUI loginGUI = new LoginGUI(); // Assuming you want to go back to the login screen
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset any fields or data related to the current operation
                amountField.setText("");
                transferField.setText("");
                
                // Close the current window (ATM interface) and return to the main menu
                frame.dispose();
                LoginGUI loginGUI = new LoginGUI(); // Assuming you want to go back to the login screen
            }
        });
        
    deleteButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int confirmation = JOptionPane.showConfirmDialog(frame, "Are you sure you want to delete your account?", "Delete Account", JOptionPane.YES_NO_OPTION);
        if (confirmation == JOptionPane.YES_OPTION) {
            LoginGUI.deleteUser(user);
            frame.dispose();
            LoginGUI loginGUI = new LoginGUI(); // Assuming you want to go back to the login screen
        }
    }
});

        frame.setVisible(true);
    }

    private void updateTransaction(String type, double amount) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Transaction transaction = new Transaction(type, amount, user.getAccount().checkBalance(), timestamp);
        user.addTransaction(transaction);
        user.saveTransactionHistory();
    }
}

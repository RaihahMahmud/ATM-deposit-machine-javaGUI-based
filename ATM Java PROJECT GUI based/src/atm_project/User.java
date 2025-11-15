
package atm_project;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User extends Person {
    
   private final Account account;
    private final List<Transaction> transactionHistory;

    public User(String username, String password, double initialBalance) {
        super(username, password);
        this.account = new Account(initialBalance) {};
        this.transactionHistory = new ArrayList<>();
    }

    public Account getAccount() {
        return account;
    }

    public void addTransaction(Transaction transaction) {
        transactionHistory.add(transaction);
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

    


    

    public void saveUser() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt", true))) {
            writer.write(username + "," + password + "," + account.checkBalance());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  
    public void saveTransactionHistory() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(username + "transaction_history.txt", true))) {
            for (Transaction transaction : transactionHistory) {
                writer.write(transaction.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteUser() {
    System.out.println("Deleting user data for: " + username); // Debug print

    File userFile = new File("user.txt");
    File transactionFile = new File(username + "transaction_history.txt");

    // Delete transaction history file
    if (transactionFile.exists()) {
        boolean deleted = transactionFile.delete();
        if (deleted) {
            System.out.println("Transaction history file deleted successfully"); // Debug print
        } else {
            System.out.println("Failed to delete transaction history file"); // Debug print
        }
    } else {
        System.out.println("Transaction history file does not exist"); // Debug print
    }
}

    public static List<User> loadUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("user.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String username = parts[0];
                    String password = parts[1];
                    double balance = Double.parseDouble(parts[2]);
                    users.add(new User(username, password, balance));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

}

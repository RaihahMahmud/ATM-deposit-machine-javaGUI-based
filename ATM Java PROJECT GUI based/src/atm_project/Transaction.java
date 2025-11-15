		
package atm_project;

public class Transaction {
  
    private final String type;
    private final double amount;
    private final double balanceAfter;
    private final String timestamp;

    public Transaction(String type, double amount, double balanceAfter, String timestamp) {
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return timestamp + " - " + type + ": BDT " + amount + " (Balance: Tk" + balanceAfter + ")";
    }
    
}

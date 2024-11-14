package perform;

public class Account {
    private int accountNo;
    private String owner;
    private String branch;
    private double balance;

    public Account(int accountNo, String owner, String branch, double balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.branch = branch;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account \n[Account No: " + accountNo + ", Owner: " + owner + ", Branch: " + branch + ", Balance: " + balance + "]";
    }
}

package perform;

public class SavingAccount extends Account {
    private String accountType; 

    public SavingAccount(int accountNo, String owner, String branch, double balance, String accountType) {
        super(accountNo, owner, branch, balance);
        this.accountType = "Saving Account";
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Account Type: " + accountType;
    }
}

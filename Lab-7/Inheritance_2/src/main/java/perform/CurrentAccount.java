package perform;

public class CurrentAccount extends Account{
    private String accountType; // Unique attribute for CurrentAccount

    public CurrentAccount(int accountNo, String owner, String branch, double balance, String accountType) {
        super(accountNo, owner, branch, balance);
        this.accountType = "Current Account";
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Account Type: " + accountType;
    }
}

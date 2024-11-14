package perform;

public class Member {
    private String name;
    private int id;
    private String contact;
    private Account account; 

    public Member(String name, int id, String contact, Account account) {
        this.name = name;
        this.id = id;
        this.contact = contact;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getContact() {
        return contact;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Member [Name: " + name + ", ID: " + id + ", Contact: " + contact +" "+ account + "]";
    }
}

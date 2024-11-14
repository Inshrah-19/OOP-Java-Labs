package library;
import java.util.ArrayList;
public class LibraryBranch {
    private String branchName;
    private ArrayList<Book> books;

    public LibraryBranch(String branchName) {
        this.branchName = branchName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                books.remove(b);
                return true;
            }
        }
        return false;
    }

    public void displayBooks() {
        System.out.println("Books in branch " + branchName + ":");
        for (Book b : books) {
            System.out.println("- " + b.getTitle());
        }
    }
    public String getBranchName() {
        return branchName;
    }
}

package library;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library("Central Library");

        
        LibraryBranch branch1 = new LibraryBranch("North Karachi");
        LibraryBranch branch2 = new LibraryBranch("Karachi Central");

        library.addBranch(branch1);
        library.addBranch(branch2);

        Book book1 = new Book("To Kill a Mockingbird");
        Book book2 = new Book("Once an incident");
        Book book3 = new Book("The Great Gatsby");

        branch1.addBook(book1);
        branch1.addBook(book2);
        branch2.addBook(book3);

        library.displayAllBranches();
        System.out.println();

        branch1.displayBooks();
        System.out.println();
        branch2.displayBooks();

        boolean removed = branch1.removeBook("To kill a Mockingbird");
        if (removed) {
            System.out.println("Successfully removed 'To Kill a Mockingbird' from North Karachi branch.");
        } 
        else {
            System.out.println("'To Kill a Mockingbird' not found in North Karachi branch.");
        }

        System.out.println();
        branch1.displayBooks();
    }
    }

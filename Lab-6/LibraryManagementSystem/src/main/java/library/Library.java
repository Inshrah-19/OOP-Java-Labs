package library;
import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<LibraryBranch> branches;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.branches = new ArrayList<>();
    }

    public void addBranch(LibraryBranch branch) {
        branches.add(branch);
    }

    public void displayAllBranches() {
        System.out.println("Branches in " + libraryName + ":");
        for (LibraryBranch br : branches) {
            System.out.println("- " + br.getBranchName());
        }
    }
}



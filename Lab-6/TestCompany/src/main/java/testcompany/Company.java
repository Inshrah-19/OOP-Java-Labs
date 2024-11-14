package testcompany;
import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Store> arrayStore;
    private int nbStore;  

    public Company(String name) {
        this.name = name;
        this.arrayStore = new ArrayList<>();
        this.nbStore = 0;
    }

    public void addStore(Store store) {
        if (nbStore < 10) {
            arrayStore.add(store);
            nbStore++;
        } 
        else {
            System.out.println("Cannot add more stores. Maximum limit reached.");
        }
    }

    public int searchNbofStore(String productName) {
        int count = 0;
        for (Store st : arrayStore) {
            if (st.searchProduct(productName)) {
                count++;
            }
        }
        return count;
    }

    public void displayAll() {
        System.out.println("Stores in a company " + name + ":");
        for (Store st : arrayStore) {
            System.out.println("  " + st);
        }
    }

    @Override
    public String toString() {
        return "Company Name: " + name + ", Number of Stores: " + nbStore;
    }
}

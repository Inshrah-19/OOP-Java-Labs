package testcompany;
import java.util.ArrayList;

public class Store {
    private String name;
    private String location;
    private ArrayList<Product> productList;
    private int nbProduct; 
    
    public Store(String name, String location) {
        this.name = name;
        this.location = location;
        this.productList = new ArrayList<>();
        this.nbProduct = 0;
    }
    
    public void addProduct(Product p) {
        if (nbProduct < 100) {
            productList.add(p);
            nbProduct++;
        } 
        else {
            System.out.println("Cannot add more products. Maximum limit reached.");
        }
    }

    public boolean searchProduct(String productName) {
        for (Product pr : productList) {
            if (pr.getName().equalsIgnoreCase(productName)) {
                return true;
            }
        }
        return false;
    }
    
    public Product deleteProduct(String productName) {
        for (Product pr : productList) {
            if (pr.getName().equalsIgnoreCase(productName)) {
                productList.remove(pr);
                nbProduct--;
                return pr;
            }
        }
        return null;
    }

    public void displayAll() {
        System.out.println("Products available in the store " + name + ":");
        for (Product pr : productList) {
            System.out.println("  " + pr);
        }
    }

    @Override
    public String toString() {
        return "Store Name: " + name + ", Location: " + location + ", Number of Products: " + nbProduct;
    }
}

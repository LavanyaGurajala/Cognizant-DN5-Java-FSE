

public class TestSearch {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop"),
                new Product(102, "Mobile"),
                new Product(103, "Keyboard"),
                new Product(104, "Mouse")
        };

        Product result = SearchOperations.linearSearch(products, 103);

        if (result != null) {
            System.out.println("Product Found: " + result.name);
        } else {
            System.out.println("Product Not Found");
        }
    }
}
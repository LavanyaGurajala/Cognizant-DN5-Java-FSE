public class SearchOperations {

    public static Product linearSearch(Product[] products, int id) {

        for (Product p : products) {

            if (p.id == id) {
                return p;
            }
        }

        return null;
    }
}
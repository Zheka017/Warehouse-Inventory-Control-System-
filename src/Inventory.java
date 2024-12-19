// Класс Inventory
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    // Метод для добавления продукта в инвентарь
    public void addProduct(Product product) {
        products.add(product);
    }

    // Метод для удаления продукта из инвентаря
    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    // Метод для поиска продукта по id
    public Product findProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    // Метод для отображения всего инвентаря
    public void displayInventory() {
        for (Product product : products) {
            product.displayProductInfo();
        }
    }
}
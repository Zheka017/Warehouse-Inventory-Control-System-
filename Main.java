public class Main {
    public static void main(String[] args) {
        // Создаем поставщика
        Supplier supplier1 = new Supplier("Supplier A", 1, "contact@supplier.com");
        supplier1.displaySupplierInfo();

        // Создаем продукты
        Product product1 = new Product("Laptop", 101, 50, 1000.0);
        Product product2 = new Product("Smartphone", 102, 100, 500.0);

        // Создаем инвентарь и добавляем продукты
        Inventory inventory = new Inventory();
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Отображаем весь инвентарь
        inventory.displayInventory();

        // Поиск продукта
        Product foundProduct = inventory.findProductById(101);
        if (foundProduct != null) {
            foundProduct.displayProductInfo();
        }
    }
}

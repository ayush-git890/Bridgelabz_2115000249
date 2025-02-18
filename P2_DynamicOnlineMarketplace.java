import java.util.*;
class Category {
    private String type;
    public Category(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public T getCategory() {
        return category;
    }
    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }
}

class ProductCatalog<T extends Category> {
    private List<Product<T>> products = new ArrayList<>();
    public void addProduct(Product<T> product) {
        products.add(product);
    }
    public void applyDiscountToProduct(Product<T> product, double percentage) {
        product.applyDiscount(percentage);
    }

    public void displayAllProducts() {
        for (Product<T> product : products) {
            System.out.println(product.getName() + " | Category: " + product.getCategory().getType() +" | Price--> " + product.getPrice());
        }
    }
}

public class P2_DynamicOnlineMarketplace{
    public static void main(String[] args) {
        ProductCatalog<Category> bookCatalog = new ProductCatalog<>();
        ProductCatalog<Category> clothingCatalog = new ProductCatalog<>();

        Category bookCategory = new Category("Moral Books");
        Category clothingCategory = new Category("Men's Wear");

        Product<Category> book = new Product<>("The Taj Mahal", 5000, bookCategory);
        Product<Category> shirt = new Product<>("Denim Jeans", 2000, clothingCategory);

        bookCatalog.addProduct(book);
        clothingCatalog.addProduct(shirt);

        bookCatalog.applyDiscountToProduct(book, 15);
        clothingCatalog.applyDiscountToProduct(shirt, 25);

        System.out.println("Book Catalog:");
        bookCatalog.displayAllProducts();

        System.out.println("Clothing Catalog:");
        clothingCatalog.displayAllProducts();
    }
}
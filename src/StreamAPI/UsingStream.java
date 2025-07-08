package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class UsingStream {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 55000));
        productsList.add(new Product(2, "Dell Laptop", 50000));
        productsList.add(new Product(3, "Lenovo Laptop", 38000));
        productsList.add(new Product(4, "Sony Laptop", 68000));
        productsList.add(new Product(5, "Apple Laptop", 110000));

        List<Float> pList = productsList.stream()
                .filter(p -> p.price > 30000) // filtering data
                .map(p -> p.price) // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(pList);
    }
}

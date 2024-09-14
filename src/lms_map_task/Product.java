package lms_map_task;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Product {
    private Map<String, Integer> productInventor;

    public Product() {
        productInventor = new TreeMap<>();
    }

    public void addProduct(String productName, int kolichestvo) {
        productInventor.putIfAbsent(productName, 0);
        productInventor.put(productName, productInventor.get(productName) + kolichestvo);
    }

    public void updateProduct(String productName, int kolichestvo) {
        if (productInventor.containsKey(productName)) {
            productInventor.put(productName, productInventor.get(productName) + kolichestvo);
        } else {
            System.out.println("Продукт табылган жок.");
        }
    }

    public String  isOutOfProduct(String productName) {
       if (productInventor.getOrDefault(productName, 0) == 0){
          return productName+"       Тугонду !!!";
       }else {
          return productName + "    Бар. ";
       }
    }

    public void printInventory() {
        for (Map.Entry<String, Integer> entry : productInventor.entrySet()) {
            System.out.println(entry.getKey() + " - Кампада: " + entry.getValue());
        }
    }
}



package lms_map_task;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductPriceSum {
    private Map<String,Double> products = new TreeMap<>();

    public  void  addProduct (String name, double price){
        products.put(name,price);
    }

    public Map<String, Double> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Double> products) {
        this.products = products;
    }

    public  double getSummPrice (){
        double summ = 0;
        for (Double price : products.values()) {
            summ += price;
        }
        return summ;
    }

    @Override
    public String toString() {
        return "\nProductPriceSum{" +
                "products=" + products +
                '}';
    }
}

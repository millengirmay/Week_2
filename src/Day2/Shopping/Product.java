package Day2.Shopping;

public class Product {
    private String name;
    private double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }
}

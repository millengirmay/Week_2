package Day2.Shopping;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> items;

    Cart(double taxRate){
        this.items = new ArrayList<Product>();
    }

    public double getTotal(){
        double sum = 0;
        for(Product item: this.items){
            sum  += item.getPrice();
        }
        return sum;
    }
    public void add(Product p){
        this.items.add(p);
    }
}

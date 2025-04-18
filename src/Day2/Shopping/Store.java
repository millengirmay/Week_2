package Day2.Shopping;

import java.util.ArrayList;

public class Store {
    private double taxRate;
    private Cart cart;
    ArrayList<Customer> customers;

    Store(double taxRate){
        this.taxRate = taxRate;
        this.cart = new Cart(this.taxRate);
        this.customers = new ArrayList<Customer>();
    }

    public void add(Product p){
        this.cart.add(p);
    }

    public double getTotalWithTax(){
        return(1+taxRate) * this.cart.getTotal();
    }
}

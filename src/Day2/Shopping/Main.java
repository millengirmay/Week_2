package Day2.Shopping;

public class Main {
    public static void main(String[] args) {
        Store s = new Store(0.08);

        s.add(new Product("paper",10.00));
        s.add(new Product("pencil", 1.00));

        double finalAmount = s.getTotalWithTax();

        System.out.println(finalAmount);

    }
}

import java.util.*;

public class ShoppingBasket {
    private List<Purchase> basket = new ArrayList<Purchase>();

    public ShoppingBasket() {
    }

    public void add(String product, int price) {
        Boolean plus = false;  
        Purchase adding = new Purchase(product, 1, price);
        for(Purchase items : this.basket) {
            if(items.getName().equals(adding.getName())) {
                plus = true;
                items.increaseAmount();
            }
        }

        if(!plus) {
            this.basket.add(adding);
        }
    }

    public int price() {
        int total = 0;

        for (Purchase items : this.basket) {
            total += items.price();
        }
        
        return total;
    }

    public void print() {
        for(Purchase items : this.basket) {
            System.out.println(items);
        }
    }
}

import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {
        
        /*
        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 7);

        System.out.println("prices: ");
        System.out.println("milk: " + store.price("milk"));
        System.out.println("coffee: " + store.price("coffee"));
        System.out.println("sugar: " + store.price("sugar"));
        */

        /*
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 1);

        System.out.println("stocks:");
        System.out.println("coffee: " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));

        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take sugar " + store.take("sugar"));

        System.out.println("stocks: ");
        System.out.println("coffee: " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));
        */

        /*
        Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 6);
        store.addProduct("buttermilk", 2, 20);
        store.addProduct("jogurt", 2, 20);

        System.out.println("products: ");
        for (String product : store.products()) {
            System.out.println(product);
        }
        */

        /*
        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println("the total price of purchase containing four milk is " + purchase.price());
        System.out.println(purchase);
        purchase.increaseAmount();
        System.out.println(purchase);
        */

        /*
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.add("buttermilk", 2);
        basket.add("cheese", 5);
        System.out.println("basket price: " + basket.price());
        basket.add("computer", 899);
        System.out.println("basket price: " + basket.price());
        */

        //basket.print();

        /*
        ShoppingBasket basket = new ShoppingBasket();
        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() + "\n");
        
        basket.add("buttermilk", 2);
        basket.print();
        System.out.println("basket price: " + basket.price() + "\n");
        
        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() + "\n");
        
        basket.add("milk", 3);
        basket.print();
        System.out.println("basket price: " + basket.price() + "\n");
        */

        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 10);
        store.addProduct("milk", 3, 20);
        store.addProduct("milkbutter", 2, 55);
        store.addProduct("bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
    }

}

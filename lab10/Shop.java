import java.util.Scanner;

public class Shop {
    
    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("below is our sale offer: ");
    
        for(String product : store.products()) {
            System.out.println(product);
        }

        while(true) {
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if(product.isEmpty()) {
                break;
            }

            if(store.stock(product) > 0) {
                basket.add(product, store.price(product));
                store.take(product);
            }

        }

        System.out.println("your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());
    }

}

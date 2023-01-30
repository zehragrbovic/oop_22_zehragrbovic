import java.util.*;

public class Storehouse{
    private Map<String, Integer> produce = new HashMap<String, Integer>();
    private Map<String, Integer> amount = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.produce.put(product, price);
        this.amount.put(product, stock);
    }

    public int price(String product) {
        if(this.produce.containsKey(product))
            return this.produce.get(product);
        return -99;
    }

    public int stock(String product) {
        if(this.amount.containsKey(product))
            return this.amount.get(product);
        return 0;
    }

    public boolean take(String product) {
        int value = this.stock(product);
        if(value == 0) {
            return false;
        }
        value--;
        this.amount.put(product, value);
        return true;
    }

    public Set<String> products() {
        Set<String> everything = new HashSet<String>();
        for(String key : this.amount.keySet()) {
            everything.add(key);
        }
        return everything;
    }

}

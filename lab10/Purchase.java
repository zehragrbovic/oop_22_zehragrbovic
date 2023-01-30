public class Purchase {
    private String product;
    private Integer amount;
    private Integer unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.amount * this.unitPrice;
    }

    public void increaseAmount() {
        this.amount++;
    }

    public String toString() {
        return this.product + " : " + this.amount;
    }

    public String getName() {
        return this.product;
    }
}

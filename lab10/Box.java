public class Box {
    private double maxCapacity;
    private int amount;
    private double capacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.amount = 0;
        this.capacity = 0;
    }

    public void add(Book item) {
        if(item.weight() + this.capacity <= this.maxCapacity) {
            this.capacity += item.weight();
            this.amount ++;
        }
    }

    public void add(CD item) {
        if(item.weight() + this.capacity <= this.maxCapacity) {
            this.capacity += item.weight();
            this.amount ++;
        }
    }

    public String toString() {
        return "Box: " + this.amount + " things, total weight " + (this.capacity) + " kg";
    }

}

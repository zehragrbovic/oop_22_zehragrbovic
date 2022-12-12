public class Counter {
    private int maxAmount;
    private int currentAmount;
    private boolean overflow;

    public Counter(int value) {
        this.maxAmount = value;
        this.currentAmount = 0;
        this.overflow = false;
    }

    public void reset() {
        this.currentAmount = 0;
    }

    public void incr1(int num) {
        this.currentAmount += num;
        if(this.currentAmount > this.maxAmount) {
            overflow = true;
            this.currentAmount = this.maxAmount;
        }
    }

    public void incr10(int num) {
        this.currentAmount += 10 * num;
        if(this.currentAmount > this.maxAmount) {
            overflow = true;
            this.currentAmount = this.maxAmount;
        }
    }

    public void incr100(int num) {
        this.currentAmount += 100 * num;
        if(this.currentAmount > this.maxAmount) {
            overflow = true;
            this.currentAmount = this.maxAmount;
        }
    }

    public void incr1000(int num) {
        this.currentAmount += 1000 * num;
        if(this.currentAmount > this.maxAmount) {
            overflow = true;
            this.currentAmount = this.maxAmount;
        }
    }

    public boolean overflow() {
        return overflow;
    }

    public int getAmount() {
        return this.currentAmount;
    }

    
}

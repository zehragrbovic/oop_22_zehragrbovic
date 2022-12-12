import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> loans;

    public PromissoryNote() {
        this.loans = new HashMap<String, Double>();
    }

    public void setLoan(String name, double value) {
        this.loans.put(name, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if(!loans.containsKey(whose)) return 0;
        return this.loans.get(whose);
    }

}

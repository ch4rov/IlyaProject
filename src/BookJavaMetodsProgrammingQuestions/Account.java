package BookJavaMetodsProgrammingQuestions;

public class Account {
    private long id;
    private double amount;
    public Account(long id, double amount){
        this.id = id;
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public void addAmount (double amount){
        this.amount += amount;
    }

    public void setAsset(int aseet){
    }

}

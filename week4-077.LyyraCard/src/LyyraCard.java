public class LyyraCard {
    private double _balance;

    public LyyraCard(double balance) { _balance = balance; }

    @Override
    public String toString() {
        return "The card has " + _balance + " euros";
    }

    public void payEconomical(){
        if(_balance >= 2.5)
            _balance-=2.5;
    }

    public void payGourmet() {
        if(_balance >= 4)
            _balance-=4;
    }

    public void loadMoney(double amount) {
        if(_balance + amount < 150 && amount >= 0){
            _balance += amount;
        }
        else if(amount >= 0)
            _balance = 150;
    }
}

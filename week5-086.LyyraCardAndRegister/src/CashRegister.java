
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        double price = 2.5;
        if(cashGiven >= price){
            cashInRegister += price;
            economicalSold++;
            return cashGiven - price;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        double price = 4;
        if(cashGiven >= price){
            cashInRegister += price;
            gourmetSold++;
            return cashGiven - price;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card){
        double price = 2.5;
        if(card.balance() >= price){
            card.pay(price);
            economicalSold++;
            return true;
        }
        else return false;
    }

    public boolean payGourmet(LyyraCard card){
        double price = 4;
        if(card.balance() >= price){
            card.pay(price);
            gourmetSold++;
            return true;
        }
        else return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum >= 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}

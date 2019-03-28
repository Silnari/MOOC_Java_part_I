
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added){
        return new Money(euros + added.euros, cents + added.cents);
    }

    public boolean less(Money compared){
        if(euros < compared.euros)
            return true;
        if(euros == compared.euros){
            if(cents < compared.cents)
                return true;
        }
        return false;
    }

    public Money minus(Money decremented){
        if(!less(decremented)){
            if(cents >= decremented.cents)
                return new Money(euros - decremented.euros, cents - decremented.cents);
            int returnCents = 100 + cents - decremented.cents;
            int returnEuros = euros - decremented.euros - 1;
            return new Money(returnEuros,returnCents);
        }
        return new Money(0,0);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}

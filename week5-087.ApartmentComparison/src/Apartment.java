
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartament){
        if(squareMeters > otherApartament.squareMeters)
            return true;
        else return false;
    }

    public int priceDifference(Apartment otherApartament){
        int price1 = squareMeters * pricePerSquareMeter;
        int price2 = otherApartament.squareMeters * otherApartament.pricePerSquareMeter;
        return Math.abs(price1 - price2);
    }

    public boolean moreExpensiveThan(Apartment otherApartament){
        if(squareMeters * pricePerSquareMeter > otherApartament.squareMeters * otherApartament.pricePerSquareMeter)
            return true;
        else return false;
    }
}

public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        value = 0;
    }

    public void next() {
        if(value < upperLimit) value++;
        else value = 0;
    }

    public String toString() {
        if(value < 10)
            return "0" + value;
        else
            return "" + value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int val){
        if(val >= 0 && val <= upperLimit)
            value = val;
    }
}

public class Counter {
    private int _value;
    private boolean _check;

    public Counter(){
        this(0,false);
    }

    public Counter(int value){
        this(value,false);
    }

    public Counter(boolean check){
        this(0, check);
    }

    public Counter(int value, boolean check){
        _value = value;
        _check = check;
    }

    public int value(){ return _value; }
    public void increase(){ _value++; }
    public void decrease(){
        if(_check){
            if(_value > 0) _value--;
        }
        else
            _value--;
    }

    public void increase(int amount){
        if(amount >=0)
            _value += amount;
    }
    public void decrease(int amount){
        if(amount >= 0){
            if(_check){
                if(_value - amount >= 0){
                    _value -= amount;
                }
                else
                    _value = 0;
            }
            else
                _value -= amount;
        }
    }
}

import java.util.Random;

public class NightSky {
    private double _destiny;
    private int _width;
    private int _height;
    private int _starsInLastPrint;

    public NightSky(double destiny){ this(destiny,20,10); }

    public NightSky(int width, int height){
        this(0.1,width,height);
    }

    public NightSky(double destiny, int width, int height){
        _destiny = destiny;
        _height = height;
        _width = width;
        _starsInLastPrint = 0;
    }

    public void printLine(){
        Random random = new Random();
        for(int i = 0; i < _width; i++){
            double probability = random.nextDouble();
            if(probability <= _destiny) {
                System.out.print("*");
                _starsInLastPrint++;
            }
            else
                System.out.print(" ");
        }
        System.out.print("\n");
    }

    public void print(){
        _starsInLastPrint = 0;
        for(int i = 0; i < _height; i++){
            printLine();
        }
    }

    public int starsInLastPrint() {
        return _starsInLastPrint;
    }
}

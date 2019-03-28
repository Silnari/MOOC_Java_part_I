import java.util.ArrayList;

public class Variance {

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int temp: list)
            sum+=temp;
        return sum;
    }


    public static double average(ArrayList<Integer> list) {
        return sum(list)/(float)list.size();
    }
    public static double variance(ArrayList<Integer> list) {
        double variance = 0;
        double avg = average(list);
        for(double temp : list){
            variance += Math.pow(temp - avg, 2);
            System.out.println(variance);
        }
        variance/=(float)(list.size() - 1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}

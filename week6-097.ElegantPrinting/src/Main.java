
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        String out = "";
        for(int number: array)
            out += (number + ", ");
        System.out.print(out.substring(0,out.length() - 2));
    }
}

public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0){
            System.out.print("*");
            amount--;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        while (amount > 0){
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        int howMany = 1;
        while (size > 0){
            printWhitespaces(size - 1);
            printStars(howMany);
            howMany++;
            size--;
        }
    }

    public static void xmasTree(int height) {
        int howMany = 1;
        int length = height - 2;
        while (height > 0){
            printWhitespaces(height-1);
            printStars(howMany);
            howMany+=2;
            height--;
        }
        printWhitespaces(length);
        printStars(3);
        printWhitespaces(length);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}

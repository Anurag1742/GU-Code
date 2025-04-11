import java.util.Scanner;

public class J02EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        System.out.print("Enter range of the number: ");
        int start = scanner.nextInt();
        System.out.print("Enter range of the number: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of Even number: " + sumEven);
        System.out.println("Sum of Odd number: " + sumOdd);
        System.out.println("Anurag Ranjan");
        System.out.println("24SCSE2030436");
    }

}

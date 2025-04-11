import java.util.Scanner;

public class J03PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start of the range:- ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range:- ");
        int end = sc.nextInt();

        System.out.print("Prime numbers between " + start + " and " + end + " are:- ");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
        System.out.println("\nAnurag Ranjan");
        System.out.println("24SCSE2030436");
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

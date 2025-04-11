import java.util.Scanner;

public class J04FactorialRecursion {

    public static int Factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("Factorial of  " + num + " is  " + Factorial(num));
        System.out.println("Anurag Ranjan");
        System.out.println("24SCSE2030436");
    }
}

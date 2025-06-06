import java.util.Scanner;

public class Arr1 {
    static Scanner sc = new Scanner(System.in);
    static int size = 0;

    public static void insertInitialValue(int arr[]) {
        System.out.print("How many values you want to insert: ");
        int n = sc.nextInt();
        System.out.println("Enter values: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[i] : ");
            arr[i] = sc.nextInt();
            size++;
        }
    }

    // Print array
    public static void printArray(int arr[]) {
        System.out.print("\nArray's elements are:- ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    // Find Average
    public static int findAverage(int arr[]) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        int average = sum / size;
        return average;
    }

    // Insert at Beginning
    public static void insertAtBeginning(int arr[]) {
        System.out.print("\nEnter value: ");
        int value = sc.nextInt();
        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = value;
        size++;
        System.out.println("Value Inserted successfully.......");
    }

    // Insert at End
    public static void insertAtEnd(int arr[]) {
        System.out.println("Enter value: ");
        int value = sc.nextInt();
        arr[size] = value;
        size++;
        System.out.println("Value Inserted successfully.......");
    }

    // Insert at position
    public static void insertAtPosition(int arr[]) {
        System.out.print("Enter Position: ");
        int pos = sc.nextInt();
        System.out.print("Enter value: ");
        int value = sc.nextInt();

        if (pos > size) {
            System.out.println("Invalid position......");
            return;
        }
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = value;
        size++;
        System.out.println("Value Inserted successfully.......");
    }

    // Delete from start
    public static void deleteFromBegin(int arr[]) {
        int value = arr[0];
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size] = (Integer) null;
        size--;
        System.out.println(value + " deleted.....");
    }

    // Delete from end
    public static void deleteFromEnd(int arr[]) {
        int value = arr[size - 1];
        arr[size - 1] = (Integer) null;
        size--;
        System.out.println(value + " deleted.....");
    }

    public static void main(String args[]) {
        int arr[] = new int[50];

        while (true) {
            System.out.println("\n=======================================");
            System.out.println("0. Exit.");
            System.out.println("1. Insert Intial Values.");
            System.out.println("2. Print array.");
            System.out.println("3. Find average.");
            System.out.println("4. Insert at Beginning.");
            System.out.println("5. Insert at End.");
            System.out.println("6. Insert at Position.");
            System.out.println("7. Delete from start.");
            System.out.println("8. Delete from End.");
            System.out.println("9. Delete from Position.");

            System.out.println("\nEnter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    insertInitialValue(arr);
                    break;
                case 2:
                    printArray(arr);
                    break;
                case 3:
                    System.out.println("Average : " + findAverage(arr));
                    break;
                case 4:
                    insertAtBeginning(arr);
                    break;
                case 5:
                    insertAtEnd(arr);
                    break;
                case 6:
                    insertAtPosition(arr);
                    break;
                case 7:
                    deleteFromBegin(arr);
                    break;
                case 8:
                    deleteFromEnd(arr);
                    break;
                default:
                    break;
            }

        }

    }
}


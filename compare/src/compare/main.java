package compare;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Sort Numbers");
        System.out.println("2. Sort Strings");
        System.out.print("Enter your choice (1/2): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Sort numbers
                numbersort numberSort = new numbersort();
                numberSort.main(new String[]{});
                break;

            case 2:
                // Sort strings
                stringsort stringSort = new stringsort();
                stringSort.main(new String[]{});
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
                break;
        }

        sc.close();
    }
}


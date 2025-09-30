package andersen;

import java.util.Scanner;

public class TaskMethods {
    static Scanner sc = new Scanner(System.in);

    public static void enterNum() {
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        if (num > 7) {
            System.out.println("Hello");
        }
    }

    public static void enterName() {
        System.out.print("Enter name: ");
        String name = sc.next();
        if (name.equals("John")) {
            System.out.println("Hello, John");
        }

        else {
            System.out.println("There is no such name");
        }
    }

    public static void enterArr() {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter " + (i + 1) + " array num: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Multiples of 3: ");
        for (int i = 0; i < 3; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(" " + arr[i]);
            }
        }
    }
}

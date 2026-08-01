import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        boolean ans = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = true;
                break; 
            }
        }

        if (ans) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
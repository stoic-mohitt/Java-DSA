import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int arr[] = new int[5];
        for(int i =0; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<=arr.length-1; i++){
            sum = sum + arr[i];
        }
        System.out.println("sum is "+sum);
        sc.close();
        }
    }


import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = 1;
        int arr[] =  new int[5];
        for(int i = 0; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<=arr.length-1; i++){
            mul = mul*arr[i];
        }
        System.out.println("Mul: "+mul);
        sc.close();
    }
}

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double min = Double.POSITIVE_INFINITY;
        int arr[] = new int[5];
        for(int i = 0; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min: "+min);
        sc.close();
    }
}

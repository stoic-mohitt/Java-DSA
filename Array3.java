import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        double max = Double.NEGATIVE_INFINITY; 
        Scanner sc = new Scanner(System.in);
        int arr[] =  new int[5];
        for(int i = 0; i<=arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<=arr.length-1;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max: "+max);
        sc.close();
    }
}

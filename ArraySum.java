import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        System.out.println("Enter the " + n+ " Elements");
        int arr[]= new int[n];
        int sum=0;

        for(int i=0;i<arr.length;i++){
            arr[i] = s.nextInt();
            if (arr[i]%5==0 && arr[i]%3==0){
                sum += arr[i];}
        }
        System.out.println(sum);
        s.close();
    }
}
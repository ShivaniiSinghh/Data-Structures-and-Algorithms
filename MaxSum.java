import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n<k){
            System.out.println("-1");
        }
        else{
            int [] arr  = new int[n];
            for(int i = 0; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int maxsum=0;
            for(int i = 0; i<n-k+1; i++) {
                int currentsum = 0;
                for (int j = 0; j < k; j++) {
                    currentsum = currentsum + arr[i + j];
                }
                maxsum = Math.max(currentsum, maxsum);
            }
            System.out.println(maxsum);
        }
    }
}

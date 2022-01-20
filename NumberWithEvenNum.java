import java.util.*;
public class NumberWithEvenNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i =0; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        for(int i =0;i<n;i++){
            String num = Integer.toString(arr[i]);
            if(num.length()%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class ArraySmall {
    int n;
    int [] arr ;
    ArraySmall(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n = s.nextInt();
        arr = new int[n];
        System.out.println("Enter "+ n + " elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }
    public int[] sortArray(){
        Arrays.sort(arr);
        return arr;
    }
    public void printElement(int [] arr, int k){
        System.out.println(arr[k-1]);
    }
}

class Exe{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArraySmall obj = new ArraySmall();
        System.out.println("Enter the value of k :");
        int k = s.nextInt();
        obj.sortArray();
        obj.printElement(obj.arr,k);
    }
}

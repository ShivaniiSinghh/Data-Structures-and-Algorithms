import java.util.Scanner;

public class RecursiveIndex {
    int n;
    int [] arr;
    RecursiveIndex(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        n = s.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }

    public int indexFinder(int []a, int currentIndex, int searchvalue){
        if(a[currentIndex] == searchvalue){
            return currentIndex+1;
        }
        else
            return indexFinder(a, currentIndex+1,searchvalue );
    }

}

class Execution{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cIndex = 0;
        RecursiveIndex obj = new RecursiveIndex();
        System.out.println("enter the element you want to search");
        int sValue = s.nextInt();
        int res = obj.indexFinder(obj.arr, cIndex,sValue);
        System.out.println("the element is at the index of array :"+res);
    }
}

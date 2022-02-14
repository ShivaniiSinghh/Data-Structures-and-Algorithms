//Map Interface CF

import org.w3c.dom.Node;
import java.util.Scanner;
class Stack{
    public int Node;
        int data;
        Node next;
}
public class ArrayProduct {
    int arr[],size,maxpro,minpro,min,max,a,b,c,d;

    ArrayProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size = ");
        size = sc.nextInt();
        System.out.println("Elements = ");
        arr = new int[size];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
            max = arr[0] * arr[1];
            min = arr[0] * arr[1];
        for (int j = 0; j < arr.length; j++) {
            for (int k = 1; k < arr.length; k++) {
                if (k==j) {
                    continue;
                }
                else {
                    minpro = arr[j] * arr[k];
                    maxpro = arr[j] * arr[k];
                    if (maxpro >= max) {
                        max = maxpro;
                        a = j;
                        b = k;
                    }
                    if (minpro <= min) {
                        min = minpro;
                        c = j;
                        d = k;
                    }
                }
            }
        }
    }
    public static void main (String[]args){
        ArrayProduct obj = new ArrayProduct();
        System.out.println("Max Product = " + obj.max);
        System.out.println("j = " + obj.a +" "+"k = " + obj.b);
        System.out.println("Min Product = " +  obj.min);
        System.out.println("j = " + obj.c +" "+"k = " + obj.d);
    }
}




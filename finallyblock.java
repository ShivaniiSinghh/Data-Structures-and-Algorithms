import java.util.Scanner;
import java.util.InputMismatchException;

// for resource cleanup operation on try block, we use finally block
public class finallyblock {

    public static void main(String[] args) {
        //int a=10;
        try {
//            Scanner s = new Scanner(System.in);
//            int c = s.nextInt();
//            int b = s.nextInt();
//            int arr[] = {12, 34, 56, 78, 90};
//            int index = s.nextInt();
//            System.out.println(c / b);
//            System.out.println(arr[index]);
            System.exit(0);
            //return;
        }
        finally {
            System.out.println("In Finally block");
        }
    }
}
//use of throw keyword
//try{
//    throw new ArithmeticException("/ by zero");
//        }
//catch(ArithmeticException obj){
//    sout(obj);
//        }
//finally dominates the return statement
// if we forcefully terminates our program, using System.exit(status:0),
// it will terminate execution w/o executing finally block


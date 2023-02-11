//sbase pehle child class phir parent class
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        //int a=10;
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int b = s.nextInt();
        int arr[] = {12, 34, 56, 78, 90};
        int index = s.nextInt();


        try {
            System.out.println(c / b);
            System.out.println(arr[index]);
//            System.out.println(args[3]);
//            System.out.println(a/0);
        }
        //  catch(Exception obj){
        //will generate error here
        // }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException |
                InputMismatchException obj) { //can't use parent class here
            System.out.println(obj);
        }
//        catch(ArrayIndexOutOfBoundsException obj){
//            System.out.println(obj);
//        }
//
//        catch(ArithmeticException obj)
//        {
//            System.out.println(obj);
////            System.out.println(obj.getMessage());
////           System.out.println(obj.toString());
////            obj.printStackTrace();
//        }
////        catch(Exception obj){
////            System.out.println(obj);
//           //no error
//            //parent class at last, child classes at first
//        }
//        System.out.println("End of the program");
//    }
//}
//NumberFormatExcpetion
//if entered string in place of int , InputMismatchException
    }
}

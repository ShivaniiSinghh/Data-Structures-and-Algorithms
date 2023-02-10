public class CheckedUncheckedException {
    public static void main(String[] args) {
        int a = 90;
        //Arithmetic Exception , division by zero exception
        //System.out.println(a/0);//abnormal termination
        //System.out.println("End of the program"); // will not execute bcuz abnormal termination
        //can't specify try block alone, must specify catch with try
        //pehle catch phir finally, if both present
       try{
           System.out.println(a/0);
       }
      // catch(ArrayIndexOutOfBoundsException obj)//abnormal termination bcuz no try block
       catch(ArithmeticException obj)
        {
            System.out.println(obj);//Graceful termination
        }
       System.out.println("End of the program");//will execute this


    }

}


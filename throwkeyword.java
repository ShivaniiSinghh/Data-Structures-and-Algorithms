public class throwkeyword {
    public static void main(String[] args) {
        //use of throw keyword
       try{
        throw new ArithmeticException("/ by zero");
        }
        catch(ArithmeticException obj){
            System.out.println(obj);
        }
    }
}

import java.util.Scanner;
public class AnagramMethod {
    public static void anagram(String a, String b){
        char []c = a.toCharArray();
        char []d = b.toCharArray();
        int flag =0;
        if (a.length()==b.length()){
            for(int i=0; i<a.length();i++){
                for(int j=0 ; j<a.length();j++){
                    if(c[i]==d[j]){
                        flag++;
                    }
                }
            }
            if(flag==a.length()){
                System.out.println("Strings are anagram");
            }
            else{
                System.out.println("Strings are not anagram");
            }
        }
        else{
            System.out.println("Strings are not anagram");
        }
    }


    public static void main(String[] args) {
        String s = "ram";
        String s2 = "amr";
        anagram(s,s2);
    }

}
import java.util.Scanner;
public class Student {
    int Roll;
    String Name;
    int Marks;


    Student(){
        Scanner s = new Scanner(System.in);
        Roll= s.nextInt();
        Name = s.next();
        Marks = s.nextInt();
    }
}
class test{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the no. of students");
        int n = s.nextInt();
        Student arr[] = new Student[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the details of student number " + i);
            arr[i] = new Student();
            sum += arr[i].Marks;
        }
        System.out.println("Overall percentage of the class is " + sum/(arr.length) +"%");


    }
}
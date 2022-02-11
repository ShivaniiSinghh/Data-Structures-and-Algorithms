import java.util.Scanner;

public class PrivateSum {
    private int Roll;
    private String Name;
    private int Marks;
    Scanner s = new Scanner(System.in);

    PrivateSum(){
        System.out.println("Enter the details");
        setRoll();
        setName();
        setMarks();
    }

    public String getName() {
        return Name;
    }

    public void setName() {
        String name = s.next();
        Name = name;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll() {
        int roll = s.nextInt();
        Roll = roll;
    }

    public int getMarks(){
        return Marks;
    }

    public void setMarks(){
        int marks = s.nextInt();
        Marks = marks;
    }
}

class test45{
    public static void main(String[] args) {
        int sum = 0;
        PrivateSum arr[]= new PrivateSum[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the details of student no" + (i+1));
            arr[i] = new PrivateSum();
        }
        int max=0;
        int index =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i].getMarks()>max){
                max = arr[i].getMarks();
                index = i;
            }
        }
        System.out.println("The details of the topper is :");
        System.out.println(arr[index].getName());
        System.out.println(arr[index].getRoll());
        System.out.println(arr[index].getMarks());


    }
}

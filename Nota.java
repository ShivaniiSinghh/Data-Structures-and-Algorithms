import java.util.Scanner;

public class Nota {
    public static int maxele(int[] arr){
        int max=0;
        for (int res: arr) {
            if (res>max)
                max = res;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<3; j++){
                arr[i][j] = s.nextInt();
            }
        }
        for (int[] ints : arr) {
            if (ints[0] == ints[1] || ints[0] == ints[2] || ints[1] == ints[2]) {
                System.out.println("NOTA");
            }
            else {
                if (maxele(ints) == ints[0]) {
                    System.out.println("A");
                }
                else if (maxele(ints) == ints[1]) {
                    System.out.println("B");
                }
                else if (maxele(ints) == ints[2]) {
                    System.out.println("C");
                }
            }
        }
    }
}
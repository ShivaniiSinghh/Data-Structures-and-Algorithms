// find the maximun sum of consecutive k array elements

import java.util.Scanner;
public class WindowSum {
    public static void main(String[] args) {
        // array creation and initialization at single line
        int arr[]  ={2,3,5,4,8,6,1};
        // frame size you are getting from the user
        int frame= new Scanner(System.in).nextInt();
        // initialize the max_sum value with min_value
        int maxsum =Integer.MIN_VALUE;
        // nesting of loop to write the logic
        for(int i =0;i<arr.length-frame;i++) {
            int framesum = 0;
            for(int j =i;j<i+frame;j++) {
                framesum= framesum+ arr[j];
            }
            maxsum= maxvalue(maxsum,framesum);
        }
        System.out.println(maxsum);
    }
    // method to get the highest value
    public static int maxvalue(int maxsum, int framesum) {
        if(maxsum>framesum)
            return maxsum;
        else
            return framesum;
    }
}
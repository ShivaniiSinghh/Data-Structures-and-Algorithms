public class BinarySearching {
    public static int binSearch(int[] arr, int k){
        int begin = 0;
        int end = arr.length -1;
        while(end-begin>1){
            int mid = (end+begin)/2;
            if(arr[mid]==k){
                return 1;
            }
            if(arr[mid]>k){
                end = mid-1;
            }
            if(arr[mid]<k){
                begin = mid+1;
            }
        }
        if((arr[begin]==k)|| (arr[end]==k)){
            return 1;
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(binSearch(arr,1));
    }
}
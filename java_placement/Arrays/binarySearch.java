package Arrays;

public class binarySearch {
    public static int midSearch(int arr[], int x) {
        int start = 0;
        int end = arr.length-1;
        int mid = start;
        while (start<=end) {
            mid = (start + end)/2;
            if (arr[mid] < x) {
                start = mid+1;
            } else if(arr[mid]>x) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {6, 10, 15, 32, 35, 40, 45, 60}; 
        int x = 40;
        System.out.println(midSearch(arr, x));
    }
}

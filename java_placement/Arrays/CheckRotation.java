package Arrays;

public class CheckRotation {
    public static int rotationVariable(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,1,2,3,4};
        System.out.println(rotationVariable(arr));
    }
}

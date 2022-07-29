public class NumCount {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(GetNumberOfK(arr,1));
    }
    public static int GetNumberOfK(int[] arr, int k) {
        int count = 0;
        if(arr.length == 0 || arr == null || k <= 0){
            return count;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                count++;
            }
        }
        return count;
    }
}

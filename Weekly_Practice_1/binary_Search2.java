public class binary_Search2 {

    public static int search(int arr[], int target){
        int start = 0;
         int end = arr.length-1;

         while(start<=end){
            int mid = ( start + end)/2;

            if(arr[mid] == target){
                return mid;

            }

            if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
         }
          return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};
        int a = search(arr,4);
        System.out.println(a);
        }
}

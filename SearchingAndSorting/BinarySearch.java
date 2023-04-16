package SearchingAndSorting;

public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int low =0;
        int high = arr.length -1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(arr[mid ] == key){
                return mid;
            }
            else if(arr[mid] > key){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,12,15,25,39,70,89,92,99};

        int index = binarySearch(arr, 92);
        if(index == -1){
            System.out.println("element not present int the array");
        }
        else{
            System.out.printf("element found at index %d \n",index);
        }
    }
}

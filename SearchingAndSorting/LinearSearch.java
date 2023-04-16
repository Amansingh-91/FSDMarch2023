package SearchingAndSorting;

public class LinearSearch {
    public static int linearSearch(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            // if key present we return index of the key in the array
            if(arr[i] == key){
                return i;
            }
        }
        // if key not present return negitive index
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {15,9,7,8,12};
        int index = linearSearch(arr, 12);
        if(index == -1){
            System.out.println("key not present in the array");
        }
        else{
            System.out.printf("element found at index %d \n",index);
        }
    }

}

package SearchingAndSorting;

public class SearchingSortingAssignmentPartA {
    public static int search(int arr[],int N){
        int left = 1;
        int right = N;
        while (left <= right) {
            int mid = (left + right)/2;
            if(arr[mid] == mid){
                return mid;
            }
            else if(arr[mid] < mid){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    } 

    public static int searchPartB(int arr[],int key){
        int l = 1;
        int r =1;
        
            while(l <= r){
                int m = (l + r)/2;
                try {
                    if(arr[m] == key){
                        return m;
                    }
                    else if(arr[m] < key){
                        l = m +1;
                        r = r *2;
                    }
                    else{
                        r = m -1;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    // TODO: handle exception
                    r = m -1;
                }
            }
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,5,6,7,8,9,10,11};
        int index = searchPartB(arr, 11);
        if(index == -1){
            System.out.println("NOT Found");
        }
        else{
            System.out.printf("element present at Index %d\n" , index);
        }
    }
}

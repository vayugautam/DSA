public class problem8 {
    public static int lastOccurence(int arr[], int key,int i) {
        if (i==arr.length) {
            return  -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if (isFound!=-1) {
            return  isFound;
        }
        //check with self
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,6,67,89,60,12};
        System.out.println(lastOccurence(arr, 67,0 ));
    }
}

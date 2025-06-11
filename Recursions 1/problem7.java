public class problem7 {
    public static int firstOccurence(int arr[],int key,int i){
        if (i == arr.length) {
            return  -1;
        }
        if (arr[i] == key) {
            return  i;
        }
        return  firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,0,4,5,6,65,34,3};
        System.out.println(firstOccurence(arr,3, 0));
    }
}
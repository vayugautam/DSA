public class Question1 {
    public static void findoccurences(int arr[],int key,int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index]==key) {
            System.out.println(index+" ");
        }
        findoccurences(arr, key, index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2, 3,4,5,4,3,3,2,2,2};
        int key = 3;
        findoccurences(arr, key, 0);
    }
}

public class binarysearch {
    public static int Binarysearch(int numbers[],int key) {
        int start = 0,end=numbers.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if (numbers[mid]== key){
            return mid;
            }
            if (numbers[mid]<key) {
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        int key = 10;
        System.out.println("index for key is : "+Binarysearch(numbers, key));
    }
}

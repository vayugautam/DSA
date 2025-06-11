public class mergesort {

    public static void printArr(int arr[]) {
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int arr[],int si,int ei) {
        if (si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;//=(si+ei)/2
        mergeSort(arr, si, mid);//left part sorting
        mergeSort(arr, mid+1, ei);//right part sorting
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[]=new int[ei-si+1];
        int i = si;// iterator for left arr
        int j = mid + 1;//iterator for right arr
        int k = 0;//iterator for temp arr
        while (i<=mid && j<=ei) {
            if (arr[i] < arr[j]) {
                temp[k]=arr[i];
                i++;k++;
            } else{
                temp[k]=arr[j];
                j++;k++;
            }
        }
        //for leftover elements after sorting
        while (i<=mid) {
            temp[k++]=arr[i++];
        }
        while (j<=ei) {
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for(k = 0,i=si; k<temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,45,66,6,6,67,-12,-34};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

public class quicksort {

    public static void printarr(int arr[]) {
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int si,int ei) {
        //base case
        if (si>=ei) {
            return;
        }
        //last element
        int pivotindex = partition(arr,si,ei);
        quickSort(arr, si, pivotindex-1);
        quickSort(arr, pivotindex+1, ei);
    }

    public static int partition(int arr[],int si, int ei){
        int pivot = arr[ei];
        int i = si-1;//to make space for those elements whose value is less than pivot
        for(int j=si;j<ei;j++){
            if (arr[j]<=pivot) {
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printarr(arr);
    }
}

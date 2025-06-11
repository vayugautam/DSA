public class searchinrotatedsortedarray {
    public static int search(int arr[],int tar,int si,int ei) {
        //base case
        if(si>ei){
            return -1;
        }
        
        
        //kaam
        int mid = si+(ei-si)/2;
        //case found
        if (arr[mid]==tar) {
            return mid;
        }
        //mid on L1
        if (arr[si]<=arr[mid]) {
            //case a:left of mid
            if (arr[si]<=tar && tar<=arr[mid]) {
                return search(arr, tar, si, mid-1);
            } else {//case b:right of mid
                return search(arr, tar, mid+1, ei);
            }
        }
        //mid on L2
        else {
            //case a:right of mid
            if (arr[mid]<=tar && tar<=arr[ei]) {
                return search(arr, tar,mid+1, ei);
            }else{//case b:left of mid
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,7,1,2,3};
        int target=6;
        int tarIdx=search(arr, target,0,arr.length-1);
        System.err.println(tarIdx);
    }
    
}

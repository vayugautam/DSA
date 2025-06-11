public class Question1 {
    public static String[] mergeSort(String[] arr,int si,int ei) {
        if (si == ei) {
            String[] A = {arr[si]};
            return A;
        }
        int mid = si+(ei-si)/2;
        String[] arr1 = mergeSort(arr, si, mid);
        String[] arr2 = mergeSort(arr, mid+1, ei);

        String[] arr3 = merge(arr1,arr2);
        return arr3;
    }

    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m+n];

        int index = 0;

        int i = 0;
        int j = 0;

        while (i<m && j<n) {
            if (isAlphabeticallysmaller(arr1[i],arr2[j])) {
                arr3[index]=arr1[i];
                i++;
                index++;
            } else {
                arr3[index]=arr2[j];
                j++;
                index++;
            }
        }
        while (i<m) {
            arr3[index]=arr1[i];
            i++;
            index++;
        }
        while (j<n) {
            arr3[index]=arr2[j];
            j++;
            index++;
        }
        return arr3;
    }
    // Return true if str1 appears before str2 in alphabetical order
    static boolean isAlphabeticallysmaller(String str1,String str2) {
        if(str1.compareTo(str2) < 0){
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        String[] arr = {"sun","earth","mars"};
        String[] a = mergeSort(arr,0,arr.length-1);
        for(int i = 0;i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}

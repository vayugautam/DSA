public class Question5 {
    public static void towerOfHanoi(int n,String source,String helper,String destination) {
        //base case
        if (n==1) {
            System.out.println("transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        //transferring n-1 disks from source to helper using destination as helper
        towerOfHanoi(n-1, source, destination, helper);
        //transferring "nth" disk from source to destination
        System.out.println("transfer disk "+n+" from "+source+" to "+destination);
        //transferring n-1 disks from helper to destination using source as helper
        towerOfHanoi(n-1, helper, source, destination);

    }
    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n, "S", "H", "D");
    }
}

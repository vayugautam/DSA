import java.util.Scanner;

public class ArrayLinearSearch {
    public static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int key = 10;
        int index = linearSearch(a, key);

        if (index == -1) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Key " + key + " is at index: " + index);
        }

        sc.close();
    }
}

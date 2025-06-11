import java.util.Scanner;

public class B_Normal_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // Consume the newline character after the integer input
        
        while (t-- > 0) {
            String a = sc.nextLine(); // Read the string
            StringBuilder b = new StringBuilder();
            
            // Traverse each character in the string and perform the transformation
            for (char i : a.toCharArray()) {
                if (i == 'p') {
                    b.append('p');  // 'p' remains 'p'
                } else if (i == 'q') {
                    b.append('q');  // 'q' remains 'q'
                } else if (i == 'w') {
                    b.append('w');  // 'w' remains 'w'
                }
            }
            
            // Reverse the string to get the mirrored effect
            b.reverse();
            
            // Print the transformed string
            System.out.println(b.toString());
        }
        
        sc.close(); // Close the scanner to avoid resource leak
    }
}
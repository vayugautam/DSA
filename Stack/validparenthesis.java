import java.util.Stack;

public class validparenthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='(' || ch=='{' || ch=='[') {//openers
                s.push(ch);
            }else{
                //closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek()=='(' && ch==')')
                ||(s.peek()=='{' && ch=='}')
                ||(s.peek()=='[' && ch==']')) {
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "{}";
        System.out.println(isValid(str));
    }
}

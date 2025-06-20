public class convertfirstlettertouppercase {
    public static String touppercase(String str) {
        String sb;
        sb = "";

        char ch = Character.toUpperCase(str.charAt(0));
        sb+=ch;
        for(int i=1;i<str.length();i++) {
            if (str.charAt(i)==' ' && i<str.length()-1) {
                sb+=str.charAt(i);
                i++;
                sb+=Character.toUpperCase(str.charAt(i));              
            } else {
                sb+=str.charAt(i);
            }
        }
        
        return sb;
    }
    public static void main(String[] args) {
        String str = "hello,my name is vayu gautam";
        System.out.println(touppercase(str));
    }
    //time complexity = O(n^2)
}

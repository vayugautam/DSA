public class printsubstring {
    public static String substring(String str,int si,int ei ) {
        String substr = "";
        for(int i =si;i<ei;i++) {
            substr += str.charAt(i);
        }
        return substr;
    }    
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str.substring(0,5));
        //System.out.println(substring(str, 0, 5));
    }
}

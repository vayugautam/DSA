public class closestmultipleof10 {
    static String roundToNearest(String str) {
        // Complete the function
        int n = str.length();
        if (str.charAt(n-1)-'0'<=5) {
            str=str.substring(0,n-1)+'0';
            return str;
        }
        else{
            int carry=1;
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(n-1,'0');
            int i = n-2;

            while (i>=0 && carry==1) {
                int currentDigit = sb.charAt(i)-'0';
                currentDigit+=carry;
                if (currentDigit>9) {
                    carry=1;
                    currentDigit=0;
                }else{
                    carry=0;
                }
                sb.setCharAt(i,(char)(currentDigit+'0'));
                i--;    
            }
            if (carry==1) {
                sb.insert(0,'1');
            }
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        String str = "137";
        String result= roundToNearest(str);
        System.out.println(result);
    }
}

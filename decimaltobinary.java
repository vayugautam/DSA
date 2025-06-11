public class decimaltobinary {
    public static void decTobin(int DecNum) {
        int myNum=DecNum;
        int pow=0;
        int binNum=0;

        while (DecNum>0) {
            int rem = DecNum%2;
            binNum=binNum+(rem*(int)Math.pow(10, pow));
            pow++;
            DecNum=DecNum/2;
        }
        System.out.println("binary " + myNum + " = " + binNum);
    
    }
    public static void main(String[] args) {
        decTobin(7);
    }
}

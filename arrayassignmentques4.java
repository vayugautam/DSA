public class arrayassignmentques4 {
    public static int trappedrainwater(int height[]) {//O(n)
        //calculate left max boundary - array
        int leftmax[]= new int[height.length];
        leftmax[0]=height[0];
        for(int i = 1; i <height.length;i++) {
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
 
        //calculate right max boundary - array
        int rightmax[]= new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0;i--) {
            rightmax[i]=Math.max(height[i], rightmax[i+ 1]);
        }
        int trappedwater = 0;
        //loop
        for(int i=0; i<height.length; i++) {
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            //trapped water = waterLevel - height[i]
            // += because it is a loop. baar baar jo bhi values hogi trapped water ki wo add hoti rahengi.
            trappedwater+= waterLevel-height[i];
        }

        return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedrainwater(height));
    }

    
}

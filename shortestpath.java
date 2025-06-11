public class shortestpath {

    public static double getshortestPath(String path) {
        int x = 0,y=0;
        for(int i = 0;i<path.length();i++) {
            char dir = path.charAt(i);
            if (dir=='W') {
                x--;
            }
            else if(dir=='E') {
                x++;
            }
            else if(dir=='N') {
                y++;
            }
            else if(dir == 'S') {
                y--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        double shortestdistance=Math.sqrt(X2+Y2);
        return shortestdistance;
    }
    public static void main(String[] args) {
        String path = "WNEENESENN";
        System.out.println(getshortestPath(path));
    }
    
}

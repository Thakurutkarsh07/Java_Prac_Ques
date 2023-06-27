public class shortest_path {
    public static void shortestPath(String path) {
        int x  = 0;
        int y = 0;
        float shortestPath = 0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        shortestPath = (float)Math.sqrt((x*x)+(y*y));
        System.out.printf("%.2f",shortestPath);
    }
    public static void main(String[] args) {
        String dir = "WNEENESEN";
        shortestPath(dir);
    }
}

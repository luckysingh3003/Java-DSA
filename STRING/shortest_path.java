public class shortest_path {
        public static void main(String[] args) {
                String path="WNEENESENNN";
                  int x = 0;
                  int y = 0;
                for(int i=0; i<path.length(); i++){
                char dir = path. charAt(i);
                // South
                if(dir == 'S') {
                y--;
                }
                //North
                else if(dir == 'N') {
                y++;
                }
                //West
                else if(dir == 'W') {
                x--; 
                }
                // East 
                else{
                x++; 
        }
         
          
}
        int X2=x*x;
        int Y2=y*y;
         System.out.println((float)Math.sqrt(X2+Y2));
        }
}
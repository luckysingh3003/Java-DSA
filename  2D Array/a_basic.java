import java.util.Scanner;

public class a_basic {
        public static void main(String[] args) {
            int arr[][]=new int[3][3];
            int n=3,m=3;
            Scanner sc=new Scanner(System.in);
            for (int i = 0; i <n; i++) {
                for(int j=0;j<m;j++){
                        arr[i][j]=sc.nextInt();
                }
                
            }

             
            for (int i = 0; i <n; i++) {
                for(int j=0;j<m;j++){
            System.out.print(arr[i][j] +" ");
        }

System.out.println();
            }

        }
}

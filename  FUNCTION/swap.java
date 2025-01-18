import java.util.*;
public class swap {
        public static void swap( int a ,int b){  
                int temp=a;
                 a=b;
                 b=temp;
                System.out.println("a and b is :"+a  +b);
        }


        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter number:");
            int a=sc.nextInt();
            System.out.print("Enter number:");
            int b=sc.nextInt();
            swap(a ,b);  
         
}
}
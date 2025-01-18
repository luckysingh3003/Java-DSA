import java.util.*;
public class input {
        public static void sumtwonum( int a ,int b){ // parameters or formal parameters
                int sum= a+b;
                System.out.println("sum is "+sum);
        }


        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter number:");
            int a=sc.nextInt();
            System.out.print("Enter number:");
            int b=sc.nextInt();
            sumtwonum(a ,b); // a b are arguments or actual parameters
        }
         
}

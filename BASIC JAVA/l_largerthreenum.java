import java.util.*;
public class l_largerthreenum {
        public static void main(String[] args) {
              Scanner sc=new Scanner(System.in) ;
              System.out.print("Enter first number:");
              int a=sc.nextInt();
              System.out.print("Enter secound number:");
              int b=sc.nextInt();
              System.out.print("Enter third number:");
              int c=sc.nextInt();
              if(a>b &&a>c){
                System.out.println("larger number is "+a);
              }
              else if(b>a && b>c){
                System.out.println("larger number is "+b);
              }
              else{
                System.out.println("lager number is "+c);
              }
              
        }     
}

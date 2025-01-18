import java.util.*;
public class declare_string {
        public static void main(String[] args) {
                // methods to declare stri ng

            char arr[]={'a','b','c','d'};
            String str1="abcd";
            String str2=new String("xyz");
            
            //Strings are IMUTABLE

            Scanner sc =new Scanner(System.in);
            String firstName;
            String lastName;
            firstName=sc.nextLine();
            lastName=sc.nextLine();
            System.out.println(firstName);
            System.out.println(firstName.length());
        
            String fullName=firstName + " " +lastName; //concat
            System.out.println(fullName);
             
            //print string 

            System.out.println(fullName.charAt(0));
            for(int i=0;i<fullName.length();i++){
                System.out.print(fullName.charAt(i) +" ");
            }
        }
}

import java.util.*;

public class e_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        
        // Output the product of the two integers
        System.out.println("Product is "+(a * b));
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
}

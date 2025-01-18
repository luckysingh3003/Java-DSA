import java.util.*;
public class a_basic_array {
        public static void main(String[] args) {
            int marks[]=new int[98 ];
            Scanner sc=new Scanner(System.in);
            marks[0]=sc.nextInt();
            marks[1]=sc.nextInt();
            marks[2]=sc.nextInt();
            marks[3]=sc.nextInt();
            System.out.println("phy:" +marks[0]);
            System.out.println("che:" +marks[1]);
            System.out.println("maths:" +marks[2]);
            System.out.println("bio:" +marks[3]);
            marks[3]=100;

            System.out.println("bio:" +marks[3]);

            // Length of array
            System.out.println("length of array=" +marks.length);

        }
}

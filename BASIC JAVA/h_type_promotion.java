public class h_type_promotion {
        public static void main(String[] args) {
           char a='a';
           char b='b';
           System.out.println(b-a);  
        //    java ne khud int me change kr dya
        //    jb bhi float*short/char+byte to ye int me convert kr ke out dega

        short c=5;
        byte d=25;
        char e='c';
        System.out.println(c+d+e);


        int g=10;
        float f=20.25f;
        long h=25;
        double i=30;
        System.out.println(g+f+h+i);
        // jb bhi esa ho to bde size me convert ho hai
        }
}

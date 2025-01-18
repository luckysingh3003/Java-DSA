public class e_pair {
        public static void main(String[] args) {
                int count=0;
                int arr[]={2,4,6,8,10};
                for(int i=0;i<arr.length;i++){
                        for(int j=i+1;j<arr.length;j++){
                                System.out.print("(" +arr[i] +  "," +arr[j] + ")");
                                count++;
                        }
                        System.out.println();
                        //count=n(n-1)/2
                }
                System.out.println("total pair is:" +count );
        } 
}

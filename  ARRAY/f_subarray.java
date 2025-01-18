public class f_subarray {
        public static void main(String[] args) {
            int arr[]={2,4,6,8,10};
            int count=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                        for(int k=i;k<=j;k++){
                                System.out.print(arr[k]+" ");
                                 
                                //total subaray=n(n+1)/2
                        }
                        System.out.println( );
                        count++;
                        
                }
            }
            System.out.println("Total subarray is:" +count);
        }
        
}

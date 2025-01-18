public class g_max_subarray {
        public static void main(String[] args) {
                int arr[]={1,-2,6,-1,3};
                int max=0;
                for(int i=0;i<arr.length;i++){
                    for(int j=i;j<arr.length;j++){
                        int sum=0;
                            for(int k=i;k<=j;k++){
                                    sum=sum+arr[k];  
                            }
                            System.out.println(sum);
                            if(max<sum){
                                max=sum;
                            } 
                    }
                }
                System.out.println("max sum of array:" +max);
        }
            
    }
     

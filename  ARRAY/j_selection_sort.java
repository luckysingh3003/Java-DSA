public class j_selection_sort {
        public static void main(String[] args) {
                int arr[]={7,4,10,8,3,1};
                for(int i=0;i<arr.length-1;i++){
                    int min=i;
                   for(int j=i+1;j<arr.length;j++){
                       if(arr[j]<arr[min])
                       min=j;
                   
                }
                if(min!=i){
                    int temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
           }
           
           
          for (int k = 0; k < arr.length; k++) {
                   System.out.print(arr[k] + " ");
               }
   
   
   
   
        }
  

}
        
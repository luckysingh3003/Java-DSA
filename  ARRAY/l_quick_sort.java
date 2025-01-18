
public class l_quick_sort {
        public static int partition(int arr[],int low,int high){
               int pivot=arr[low];
               int start=low;
               int end=high;

               while(start<end){
                while (arr[start] <= pivot && start < end) {
                        start++;
 
                }
                while(arr[end]>pivot){
                        end--;
                }
                if(start<end){
                        int temp=arr[start];
                        arr[start]=arr[end];
                        arr[end]=temp;
                }
               }
              int temp=arr[low];
              arr[low]=arr[end];
              arr[end]=temp;
              return end;
        }
        public static void quickSort(int arr[],int low,int high){
                if(low<high){
                       int loc= partition(arr,low,high);
                       quickSort(arr,low,loc-1);
                       quickSort(arr,loc+1,high);

                }
        }
        public static void main(String[] args) {
               
            int arr[]={7,6,10,5,9,2,1,15,7};
            int n=arr.length;
            quickSort(arr,0,n-1);

            
            for(int i = 0; i  < n; i++) {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
}

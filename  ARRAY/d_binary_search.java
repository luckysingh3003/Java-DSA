public class d_binary_search {
        public static int binarysearch(int num[],int key){
               int start=0;
                int end= num.length-1;
                while(start<=end){
                        int mid=(start+end)/2;
                        if(num[mid]==key){
                                return mid;
                        }
                        if(num[mid]<key){ //right
                                start=mid+1;
                        }
                        else{ //left
                                end=mid-1;
                        }
                }
                return -1;
        }
        public static void main(String[] args) {
                int num[]={2,4,6,8,10,12,14,16};
                int key=10;
               int  indx= binarysearch(num,key);
                System.out.println("index for key is :" + indx);
        }
        
}

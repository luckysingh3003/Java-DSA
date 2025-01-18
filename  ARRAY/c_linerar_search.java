public class c_linerar_search {
        
        public static void main(String[] args) {
            int num[]={2,4,6,8,10,12,14,16};
            int key=11;
            for(int i=0;i<num.length;i++){
               if(num[i]==key){
                System.out.println("key is at index: " +i);
               }
               else{
                System.out.println("Not found");
                break; 
               }

            }
        }
}

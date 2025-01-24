public class n_merge_sort {
        public static void merge(int[] a, int l, int mid, int r) {
                    int i = l;
                    int j = mid + 1;
                    int k =0;
                  
                  int[] b = new int[r-l+1];
                  
                    while (i <= mid && j <= r) {
                        if (a[i] < a[j]) {
                            b[k] = a[i];
                            i++;
                        } else {
                            b[k] = a[j];
                            j++;
                        }
                        k++;
                    }
            
                    if(i>mid){
                    while (j <= r) {
                        b[k] = a[j];
                        j++;
                        k++;
                    }
                }
            
                     else{
                    while (i<=mid) {
                        b[k] = a[i];
                        i++;
                        k++;
                    }
                }
            
                     
                    for (k= 0; k<b.length; k++) {
                        a[k+l] = b[k];
                    }
                }
            
                
                public static void mergesort(int[] a, int l, int r) {
                    if (l < r) {
                        int mid = (l + r) / 2;
                        mergesort(a, l, mid);       
                        mergesort(a, mid + 1, r);   
                        merge(a, l, mid, r);       
                    }
                }
            
                
                public static void main(String[] args) {
                    int[] a = {9, 4, 7, 6, 3, 1, 5};   
                    int l = 0;  
                    int r = a.length - 1;   
                    mergesort(a, l, r);   
                    for ( int i=0; i<a.length;i++) {
                        System.out.print(a[i] + " "); 
                    }
                }
            }
            
            
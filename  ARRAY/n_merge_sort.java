public class n_merge_sort {
        

                // Merge function to merge two halves of the array
                public static void merge(int arr[], int lb, int mid, int ub) {
                    int[] b = new int[ub - lb + 1];  // Temporary array to hold merged result
                    int i = lb;  // Starting index for the left subarray
                    int j = mid + 1;  // Starting index for the right subarray
                    int k = 0;  // Starting index for the temporary array
            
                    // Merge the two subarrays into temp[]
                    while (i <= mid && j <= ub) {
                        if (arr[i] <= arr[j]) {
                            b[k] = arr[i];
                            i++;
                        } else {
                            b[k] = arr[j];
                            j++;
                        }
                        k++;
                    }
            
                    // If there are remaining elements in the left subarray
                    while (i <= mid) {
                        b[k] = arr[i];
                        i++;
                        k++;
                    }
            
                    // If there are remaining elements in the right subarray
                    while (j <= ub) {
                        b[k] = arr[j];
                        j++;
                        k++;
                    }
            
                    // Copy the merged elements back into the original array
                    for (i = 0; i < b.length; i++) {
                        arr[lb + i] = b[i];
                    }
                }
            
                // Mergesort function to divide the array and call merge
                public static void mergesort(int arr[], int lb, int ub) {
                    if (lb < ub) {
                        int mid = (lb + ub) / 2;  // Find the middle point
                        mergesort(arr, lb, mid);  // Recursively sort the left half
                        mergesort(arr, mid + 1, ub);  // Recursively sort the right half
                        merge(arr, lb, mid, ub);  // Merge the two sorted halves
                    }
                }
            
                public static void main(String[] args) {
                    int arr[] = {6, 3, 9, 5, 2, 9};  // Input array
                    int n = arr.length;
            
                    // Call mergesort on the entire array
                    mergesort(arr, 0, n - 1);
            
                    // Print the sorted array
                    System.out.print("Sorted array: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
        
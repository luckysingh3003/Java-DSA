public class search_in_sorted_array {
public static void main(String[] args) {
    
        int matrix[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
            };
            
            int row = 0;
            int col = matrix[0].length - 1; // Start from the top-right corner
            int key = 33;
            
            while (row < matrix.length && col >= 0) {
                if (matrix[row][col] == key) {
                    System.out.println("Element found at (" + row + ", " + col + ")");
                    return;  // Element found, exit the method
                }
                else if (key < matrix[row][col]) {
                    col--;  // Move left
                }
                else {
                    row++;  // Move down
                }
            }
            
            System.out.println("Element not found");
        }
}
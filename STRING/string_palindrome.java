public class string_palindrome { 
                         public static void main(String[] args) {
                    String str = "rfcecar";   
                    int n = str.length();
            
                    
                    boolean isPalindrome = true;
                    
                     
                    for (int i = 0; i < n / 2; i++) {
                       
                        if (str.charAt(i) != str.charAt(n - i - 1)) {
                            isPalindrome = false;   
                            break;   
                        }
                    }
                    
                    
                    if (isPalindrome==true) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not a palindrome");
                    }
                }
            }
        
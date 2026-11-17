
public class StringPalindrome {
    public static boolean isPalindrome(String text) {
        // Normalize case and remove non-alphanumeric characters if needed
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "Radar";
        System.out.println(word + " is palindrome? " + isPalindrome(word));
    }
}

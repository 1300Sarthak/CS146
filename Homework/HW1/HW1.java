public class HW1 {
    public static boolean isPalindrome(String s) {
        String lowerCaseString = s.toLowerCase();

        StringBuilder cleanString = new StringBuilder();
        for (int i = 0; i < lowerCaseString.length(); i++) {
            char c = lowerCaseString.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleanString.append(c);
            }
        }

        int left = 0;
        int right = cleanString.length() - 1;
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testString1 = "No lemon, no melon";
        System.out.println(isPalindrome(testString1));

        String testString2 = "12321";
        System.out.println(isPalindrome(testString2));

    }
}

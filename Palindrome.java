public class Palindrome {
    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() -  1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "malayalam";
        String s2 = "hello";
        String s3 = "racecar";
        System.out.println(isPalindrome(s1)); //true
        System.out.println(isPalindrome(s2)); //false
        System.out.println(isPalindrome(s3)); //true
    }
}




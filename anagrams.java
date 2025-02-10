import java.util.HashMap;
import java.util.Map;

public class anagrams {
    public static boolean anagramCheck(String s1, String s2) {
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);
            if (!freq.containsKey(currentChar)) {
                freq.put(currentChar, 1);
            } else {
                freq.put(currentChar, freq.get(currentChar) + 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            if (!freq2.containsKey(currentChar)) {
                freq2.put(currentChar, 1);
            } else {
                freq2.put(currentChar, freq2.get(currentChar) + 1);
            }
        }
        return freq.equals(freq2);
    }
    public static void main(String[] args) {
        String s1 = "hello"; String s2 = "world";
        String s3 = "google"; String s4 = "gogole";
        System.out.println(anagramCheck(s1, s2)); //false
        System.out.println(anagramCheck(s3, s4)); //true
    }
}



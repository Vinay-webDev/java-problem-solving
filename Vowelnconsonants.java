import java.util.Arrays;
import java.util.Set;
public class Vowelnconsonants {
    public static int[] vowelandconsonatcount(String s) {
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u');
        int n = s.length();
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < n; i++) {
            if (vowelSet.contains(s.charAt(i))) {
                vowel++;
            } else {
                consonant++;
            }
        }
        return new int[]{vowel, consonant};
    }
    public static void main(String[] args) {
        String s1 = "hellobro";
        String s2 = "javasucks";
        String s3 = "ihatejavasyntax";
        System.out.println(Arrays.toString(vowelandconsonatcount(s1))); //[3, 5]
        System.out.println(Arrays.toString(vowelandconsonatcount(s2))); //[3, 6]
        System.out.println(Arrays.toString(vowelandconsonatcount(s3))); //[6, 9]
    }
}







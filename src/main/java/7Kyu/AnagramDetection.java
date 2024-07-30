import java.util.Arrays;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        String[] originalLower = original.toLowerCase().split("");
        String[] testLower = test.toLowerCase().split("");
        Arrays.sort(originalLower);
        Arrays.sort(testLower);
        return Arrays.equals(originalLower, testLower);
    }
}
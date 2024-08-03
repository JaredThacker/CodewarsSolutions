public class GetMiddleCharacter {
    public static String getMiddle(String word) {
        int len = word.length()/2;
        return (word.length() % 2 == 0) ? word.substring(len - 1, len + 1) : word.substring(len, len + 1);
    }
}

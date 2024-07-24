public class VowelCount {

    public static int getCount(String str) {
        //?i makes regex case insensitive flag on
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}

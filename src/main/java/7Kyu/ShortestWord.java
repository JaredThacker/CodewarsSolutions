public class ShortestWord {
    public static int findShort(String s) {
        String[] split = s.split(" ");
        Integer min = Integer.MAX_VALUE;
        for (String word : split){
            if (word.length() < min){
                min = word.length();
            }
        }
        return min;
    }
}

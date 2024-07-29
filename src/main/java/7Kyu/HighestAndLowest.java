public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        String[] split = numbers.split(" ");
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        for (String num : split){
            high = (Integer.valueOf(num) > high) ? Integer.valueOf(num) : high;
            low = (Integer.valueOf(num) < low) ? Integer.valueOf(num) : low;
        }
        return String.format("%d %d", high, low);
    }
}

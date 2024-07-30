public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        String s = Integer.toString(n);
        return (s.length() > 1) ? Integer.valueOf(s.replaceAll("0*$", "")) : n;
    }
}
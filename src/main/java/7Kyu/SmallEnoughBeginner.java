public class SmallEnoughBeginner {
    public static boolean smallEnough(int[] a, int limit){
        return java.util.Arrays.stream(a).noneMatch(e -> e > limit);
    }
}

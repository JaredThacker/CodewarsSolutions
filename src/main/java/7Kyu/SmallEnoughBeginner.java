public class SmallEnoughBeginner {
    public static boolean smallEnough(int[] a, int limit){
        int count = 0;
        for (int num : a){
            count += (num <= limit) ? 1: 0;
        }
        return count == a.length;
    }
}

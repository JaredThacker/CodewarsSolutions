public class LostWithoutAMap {
    public static int[] map(int[] arr) {
        int[] doubled = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            doubled[i] = arr[i] * 2;
        }
        return doubled;
    }
}

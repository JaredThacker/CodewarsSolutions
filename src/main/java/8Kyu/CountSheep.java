public class CountSheep {
    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0){
            return "";
        }
        for (int i = 1; i <= num; i++){
            sb.append(i);
            sb.append(" sheep...");
        }
        return sb.toString();
    }
}

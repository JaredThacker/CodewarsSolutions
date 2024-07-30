import java.util.ArrayList;
import java.util.regex.Pattern;

public class MexicanWave {

    public static String[] wave(String str) {
        ArrayList<String> waveElements = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Pattern.compile("[a-zA-Z]").matcher(String.valueOf(str.charAt(i))).matches()) {
                String leftPart = str.substring(0, i).toLowerCase();
                String capitalized = str.substring(i, i + 1).toUpperCase();
                String rightPart = str.substring(i + 1).toLowerCase();
                waveElements.add(String.format("%s%s%s", leftPart, capitalized, rightPart));
            }
        }

        return waveElements.toArray(String[]::new);
    }

}
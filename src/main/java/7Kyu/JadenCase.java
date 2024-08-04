import java.util.Arrays;
import java.util.stream.*;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (null == phrase || phrase.isEmpty()) {
            return null;
        }

        return Arrays.stream(phrase.split(" "))
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                .collect(Collectors.joining(" "));
    }

//    public String toJadenCase(String phrase) {
//        if (phrase == null || phrase.isEmpty()) {
//            return null;
//        }
//
//        String[] split = phrase.split(" ");
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < split.length; i++){
//            sb.append(Character.toUpperCase(split[i].charAt(0)))
//                    .append(split[i].substring(1))
//                    .append(" ");
//        }
//
//        return sb.toString().trim();
//    }

}

import java.util.*;
import java.util.stream.*;

public class MyLanguageSkills {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        List<String> languages = new ArrayList<>();

        List<Map.Entry<String, Integer>> sorted = results.entrySet().stream()
                .sorted(Collections.reverseOrder(Comparator.comparingInt(Map.Entry::getValue)))
                .collect(Collectors.toList());

        for (Map.Entry<String, Integer> entry : sorted){
            if (entry.getValue() >= 60){
                languages.add(entry.getKey());
            }
        }
        return languages;
    }
}

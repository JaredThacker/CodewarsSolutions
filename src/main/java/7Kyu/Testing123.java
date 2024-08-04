import java.util.*;

public class Testing123 {
    public static List<String> number(List<String> lines) {
        List<String> prepended = new ArrayList<>();
        int i = 1;
        for (String line : lines){
            prepended.add(i++ + ": " + line);
        }
        return prepended;
    }
}

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {


    public static List<Object> filterList(final List<Object> list) {
        List<Object> filteredList = list.stream()
                .filter(o -> o instanceof Integer)
                .collect(Collectors.toList());
        return filteredList;
    }
}

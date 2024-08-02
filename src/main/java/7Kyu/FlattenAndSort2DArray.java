import java.util.Arrays;
import java.util.stream.*;

public class FlattenAndSort2DArray {
    public static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array).flatMapToInt(IntStream::of).sorted().toArray();
    }
}

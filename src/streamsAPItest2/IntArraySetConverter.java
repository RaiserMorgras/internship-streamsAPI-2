package streamsAPItest2;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class IntArraySetConverter {
    public static Set<Integer> convertToSet(int[] array) {
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.toSet());
    }
    public static int[] convertToArray(Set<Integer> set) {
        return set.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

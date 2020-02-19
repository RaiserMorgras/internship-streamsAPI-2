package streamsAPItest2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.Assert.*;

public class TestCases {
    @Test
    public void testCase1() {
        int[] array = new int[] {7, 15, -20, 73, 4, 15};
        Set<Integer> expected = Set.of(7, 15, -20, 73, 4);
        Set<Integer> actual = IntArraySetConverter.convertToSet(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        Set<Integer> set = Set.of(1, -3, 5, 0, 10);
        int[] expected = new int[] {1, -3, 5, 0, 10};
        int[] actual = IntArraySetConverter.convertToArray(set);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}

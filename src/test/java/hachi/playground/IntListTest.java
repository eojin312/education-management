package hachi.playground;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntListTest {

    @Test
    public void sortInts() {
        final int[] numbers = {7, 2, 4, 13, 5};
        final int[] expected = {-5, -3, -1, 1, 4, 9};

        Arrays.sort(numbers);
    }

    @Test
    public void sortObject() {
        final String[] strings = {"z", "abc", "g",};
        final String[] expected = {"cdf", "wer", "dldjwls"};

        Arrays.sort(strings);
    }
}

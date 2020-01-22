package hachi.playground;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
import static org.junit.Assert.*;

public class IntListTest {

    @Test
    public void sortInts() {
        final int[] numbers = {7, 2, 4, 13, 5};
        final int[] expected = {-5, -3, -1, 1, 4, 9};

        sort(numbers);
        assertArrayEquals(numbers, expected);
    }

    @Test
    public void sortObject() {
        final String[] strings = {"z", "abc", "g",};
        final String[] expected = {"cdf", "wer", "dldjwls"};
        sort(strings);
        assertEquals(strings, expected);
        assertArrayEquals(strings, expected);
        Assert.assertArrayEquals(strings, expected);
    }
}

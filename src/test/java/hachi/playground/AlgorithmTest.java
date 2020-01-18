package hachi.playground;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlgorithmTest {

    @Test
    public void arrayListSortTest() {
        Integer[] array = {9, 8, 2, 5, 7, 4};
        List<Integer> list = Arrays.asList(array);

        for (Integer item : list) {
            System.out.println(item);
        }

        System.out.println("오름차순---------------");

        Collections.sort(list);

        for (Integer item : list) {
            System.out.println(item);
        }

        System.out.println("내림차순---------------");

        Collections.reverse(list);

        for (Integer item : list) {
            System.out.println(item);
        }

    }

    @Test
    public void 버블소트테스트() {

        int[] array = {9, 8, 2, 5, 7, 4};
        this.bubleSort(array);

        for (Integer item : array) {
            System.out.println(item);
        }

    }

    public void bubleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

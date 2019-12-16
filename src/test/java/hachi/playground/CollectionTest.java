package hachi.playground;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class CollectionTest {

    @Test
    public void setTest() {
        Set<Integer> testSet = new HashSet<>();

        testSet.add(5);
        testSet.add(4);
        testSet.add(3);
        testSet.add(4);
        testSet.add(4);
        testSet.add(4);

        for (Integer item : testSet) {
            System.out.println(item);
        }
    }
}

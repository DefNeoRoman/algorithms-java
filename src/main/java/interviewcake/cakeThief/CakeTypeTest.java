package interviewcake.cakeThief;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CakeTypeTest {

    @Test
    public void test() {
        CakeType[] cakeTypes = new CakeType[]{
                new CakeType(7, 160),
                new CakeType(3, 90),
                new CakeType(2, 15),
        };

        int capacity = 20;

        assertEquals(555, maxDuffelBagValue(cakeTypes, capacity));
    }

    private int maxDuffelBagValue(CakeType[] cakeTypes, int capacity) {
        Arrays.sort(cakeTypes, (x, y) -> (y.value / y.weight) - (x.value / x.weight));

        int maxTotalValue = 0;

        for (CakeType item : cakeTypes) {
            int count = capacity / item.weight;
            capacity -= item.weight * count;
            maxTotalValue += item.value * count;
            System.out.printf("item : %s, count : %s, capacity : %s, maxTotalValue : %s\n", item, count, capacity, maxTotalValue);
        }

        return maxTotalValue;
    }

}
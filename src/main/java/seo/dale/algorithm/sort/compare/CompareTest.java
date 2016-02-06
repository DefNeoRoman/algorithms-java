package seo.dale.algorithm.sort.compare;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CompareTest {

    @Test
    public void testComparable() {
        Random random = new Random();

        List<Dummy> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int no = random.nextInt(100);
            int id = random.nextInt(1000);
            list.add(new Dummy(no, "#" + id));
        }

        Collections.sort(list);

        for (Dummy d : list) {
            System.out.println(d);
        }

    }

    @Test
    public void testComparator() {
        Random random = new Random();

        List<Dummy> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int no = random.nextInt(100);
            int id = random.nextInt(1000);
            list.add(new Dummy(no, "#" + id));
        }

        Collections.sort(list, new DummyIdComparator());

        for (Dummy d : list) {
            System.out.println(d);
        }

    }


}
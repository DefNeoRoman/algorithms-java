package seo.dale.algorithm.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListIteratorTest {

    final Iterator<Integer> a = Arrays.asList(1, 2, 3, 4, 5).iterator();
    final Iterator<Integer> b = Arrays.asList(6).iterator();;
    final Iterator<Integer> c = new ArrayList<Integer>().iterator();
    final Iterator<Integer> d = new ArrayList<Integer>().iterator();
    final Iterator<Integer> e = Arrays.asList(7, 8, 9).iterator();

    final ListIterator<Integer> listIterator = new ListIterator<>(Arrays.asList(a, b, c, d, e));
    // 제네릭 공부하고 다시하기
}

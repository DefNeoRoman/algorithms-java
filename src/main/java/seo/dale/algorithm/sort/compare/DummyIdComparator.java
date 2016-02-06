package seo.dale.algorithm.sort.compare;

import java.util.Comparator;

public class DummyIdComparator implements Comparator<Dummy> {

    @Override
    public int compare(Dummy o1, Dummy o2) {
        return o1.id.compareTo(o2.id);
    }
}
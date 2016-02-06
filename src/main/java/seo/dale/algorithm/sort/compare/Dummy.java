package seo.dale.algorithm.sort.compare;

public class Dummy implements Comparable<Dummy> {

    int no;
    String id;

    public Dummy(int no, String id) {
        this.no = no;
        this.id = id;
    }

    @Override
    public int compareTo(Dummy other) {
        return no - other.no;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "no=" + no +
                ", id='" + id + '\'' +
                '}';
    }

}
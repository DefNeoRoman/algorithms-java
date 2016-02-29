package interviewcake.cakeThief;

/**
 * https://www.interviewcake.com/question/java/cake-thief?utm_source=weekly_email
 */
public class CakeType {

    int weight;
    int value;

    public CakeType(int weight, int value) {
        this.weight = weight;
        this.value  = value;
    }

    @Override
    public String toString() {
        return "CakeType{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}

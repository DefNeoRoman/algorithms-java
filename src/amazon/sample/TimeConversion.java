package amazon.sample;

import java.util.Scanner;

/**
 * Created by Dale on 2016-01-15.
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        int hour = Integer.valueOf(time.substring(0, 2));
        String lastTwoWords = time.substring(8, 10);
        if ("PM".equals(lastTwoWords)) {
            if (hour != 12) {
                hour += 12;
            }
        } else {
            if (hour == 12) {
                hour = 0;
            }
        }
        hour %= 24;

        String remain = time.substring(2, 8);
        System.out.printf("%02d%s\n", hour, remain);
    }

}

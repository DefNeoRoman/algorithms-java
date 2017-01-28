package CtCI.Ch05_BitManipulation.Q5_08_Draw_Line;

/**
 * https://github.com/careercup/CtCI-6th-Edition/blob/master/Java/Ch%2005.%20Bit%20Manipulation/Q5_08_Draw_Line/Question.java
 */
public class Question {

    public static void drawLine(byte[] screen, int width, int x1, int x2, int y) {
        for (int i = x1; i <= x2; i++) {
            screen[y] += 1 << (width - 1 - i);
        }
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("11110", 2));
        int width = 8 * 1;
        int height = 3;
        for (int r = 0; r < height; r++) {
            for (int c1 = 0; c1 < width; c1++) {
                for (int c2 = c1; c2 < width; c2++) {
                    byte[] screen = new byte[width * height / 8];

                    System.out.println("row: " + r + ": " + c1 + " -> " + c2);
                    drawLine(screen, width, c1, c2, r);
                    printScreen(screen, width);
                    System.out.println("\n\n");
                }
            }
        }
    }

    public static void printScreen(byte[] screen, int width) {
        int height = screen.length * 8 / width;
        for (int r = 0; r < height; r++) {
            for (int c = 0; c < width; c+=8) {
                byte b = screen[computeByteNum(width, c, r)];
                printByte(b);
            }
            System.out.println("");
        }
    }

    public static int computeByteNum(int width, int x, int y) {
        return (width * y + x) / 8;
    }

    public static void printByte(byte b) {
        for (int i = 7; i >= 0; i--) {
            char c = ((b >> i) & 1) == 1 ? '1' : '_';
            System.out.print(c);
        }
    }

}

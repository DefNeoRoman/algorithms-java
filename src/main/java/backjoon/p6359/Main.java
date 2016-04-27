package backjoon.p6359;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/10797
 *
 문제
 서울시는 6월 1일부터 교통 혼잡을 막기 위해서 자동차 10부제를 시행한다.
 자동차 10부제는 자동차 번호의 일의 자리 숫자와 날짜의 일의 자리 숫자가 일치하면 해당 자동차의 운행을 금지하는 것이다.
 예를 들어, 자동차 번호의 일의 자리 숫자가 7이면 7일, 17일, 27일에 운행하지 못한다. 또한, 자동차 번호의 일의 자리 숫자가 0이면 10일, 20일, 30일에 운행하지 못한다.
 여러분들은 일일 경찰관이 되어 10부제를 위반하는 자동차의 대수를 세는 봉사활동을 하려고 한다. 날짜의 일의 자리 숫자가 주어지고 5대의 자동차 번호의 일의 자리 숫자가 주어졌을 때 위반하는 자동차의 대수를 출력하면 된다.

 입력
 첫 줄에는 날짜의 일의 자리 숫자가 주어지고 두 번째 줄에는 5대의 자동차 번호의 일의 자리 숫자가 주어진다. 날짜와 자동차의 일의 자리 숫자는 모두 0에서 9까지의 정수 중 하나이다.

 출력
 주어진 날짜와 자동차의 일의 자리 숫자를 보고 10부제를 위반하는 차량의 대수를 출력한다.
 */
public class Main {

	@Test
	public void test1() {
		String input = "1\n" +
				"1 2 3 4 5";
		execute(new ByteArrayInputStream(input.getBytes()));
	}

	@Test
	public void test2() {
		String input = "3\n" +
				"1 2 3 5 3";
		execute(new ByteArrayInputStream(input.getBytes()));
	}

	@Test
	public void test3() {
		String input = "5\n" +
				"1 3 0 7 4";
		execute(new ByteArrayInputStream(input.getBytes()));
	}

	@Test
	public void test4() {
		String input = "4\n" +
				"1112 1234 1014 7777 4440";
		execute(new ByteArrayInputStream(input.getBytes()));
	}

	public static void main(String[] args) {
		execute(System.in);
	}

	public static void execute(InputStream inputStream) {
		Scanner scanner = new Scanner(inputStream);
		int num = scanner.nextInt();
		String[] carArray = new String[5];
		for (int i = 0; i < 5; i++) {
			carArray[i] = scanner.next();
		}
		int count = countCarsThatEndsWith(num, carArray);
		System.out.println(count);
	}

	private static int countCarsThatEndsWith(int num, String[] carArray) {
		int count = 0;
		for (String car : carArray) {
			char endChar = car.charAt(car.length() - 1);
			int endInt = Character.getNumericValue(endChar);
			// System.out.printf("- car : %s, end : %s, same : %s\n", car, endInt, endInt == num);
			if (endInt == num) {
				count++;
			}
		}
		return count;
	}

}

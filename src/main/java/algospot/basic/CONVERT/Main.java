/**
 * https://www.algospot.com/judge/problem/read/CONVERT
 */
package algospot.basic.CONVERT;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in);) {
			int count = scanner.nextInt();
			for (int i = 0; i < count; i ++) {
				double number = scanner.nextDouble();
				String unitStr = scanner.next();
				Measurement.Unit unit = Measurement.Unit.valueOf(unitStr);
				Measurement source = new Measurement(number, unit);
				Measurement target = convert(source);
				System.out.printf("%d %s%n", i + 1, target);
			}
		}
	}
	
	public static Measurement convert(Measurement source) {
		double number = -1;
		Measurement.Unit unit = null;
		
		switch(source.getUnit()) {
		case kg:
			number = source.getNumber() * 2.2046;
			unit = Measurement.Unit.lb;
			break;
		case lb:
			number = source.getNumber() * 0.4536;
			unit = Measurement.Unit.kg;
			break;
		case l:
			number = source.getNumber() * 0.2642;
			unit = Measurement.Unit.g;
			break;
		case g:
			number = source.getNumber() * 3.7854;
			unit = Measurement.Unit.l;
			break;
		}
				
		return new Measurement(number, unit);
	}
	
}

class Measurement {
	
	enum Unit {
		kg, lb, l, g
	}

	private double number;
	
	private Unit unit;
	
	public Measurement(double number, Unit unit) {
		this.number = number;
		this.unit = unit;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return String.format("%.4f %s", number, unit);
	}
	
}

package algospot.basic.CONVERT;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void test() {
		Measurement measurement1 = Main.convert(new Measurement(1, Measurement.Unit.kg));
		System.out.println(measurement1);
		assertEquals("2.2046 lb", measurement1.toString());
		
		Measurement measurement2 = Main.convert(new Measurement(2, Measurement.Unit.l));
		System.out.println(measurement2);
		assertEquals("0.5284 g", measurement2.toString());
		
		Measurement measurement3 = Main.convert(new Measurement(7, Measurement.Unit.lb));
		System.out.println(measurement3);
		assertEquals("3.1752 kg", measurement3.toString());
		
		Measurement measurement4 = Main.convert(new Measurement(3.5, Measurement.Unit.g));
		System.out.println(measurement4);
		assertEquals("13.2489 l", measurement4.toString());
		
		Measurement measurement5 = Main.convert(new Measurement(0, Measurement.Unit.l));
		System.out.println(measurement5);
		assertEquals("0.0000 g", measurement5.toString());
	}

}

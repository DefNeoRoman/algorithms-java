package amazon;
import java.util.*;

import org.junit.Test;

/**
 * A test case to try park 8 cars in the garage with 10 spaces.
 */
public class ParkingLotSystemTest {

	@Test
	public void test() {
		System.out.println("------------------ Initialized ------------------");
		// The first argument = the number of parking spaces.
		// The second argument = the range of desirability. 
		MyParkingGarage garage = new MyParkingGarage(10, 5);
		SpaceAssigner spaceAssigner = new SpaceAssigner();
		spaceAssigner.initialize(garage);
		garage.printStatus();
		
		System.out.println("------------------ Parking Started ------------------");
		Collection<Car> testCars = createTestCars();
		for (Car car : testCars) {
			Space space = spaceAssigner.assignSpace(car);
			if (space != null) {
				garage.carParked(car, space);
			}
		}
		garage.printStatus();;
		
		System.out.println("------------------ Leaving Started ------------------");
		Iterator<Space> spaceIterator = garage.getSpaces();
		while(spaceIterator.hasNext()) {
			Space space = spaceIterator.next();
			garage.spaceEmpty(space);
		}
		garage.printStatus();
		
	}
	
	private List<Car> createTestCars() {
		String[] states = {"AL", "CA", "KY", "MD", "NJ", "NY", "TX", "VA"};
		String[] numbers = {"47C72N2", "6JIV337", "547KPE", "3DDB31", "ZWT69X", "FAE5954", "BC5X489", "XXJ6610"};
		List<Car> cars = new ArrayList<Car>();
		for (int i = 0; i < numbers.length; i++) {
			cars.add(new MyCar(states[i], numbers[i]));
		}
		return cars;
	}

}

package amazon;
import java.util.Iterator;

/**
 * The SpaceAssigner is responsible for assigning a space for an incoming car to
 * park in. This is done by calling the assignSpace() API.
 *
 * The SpaceAssigner responds to changes in space availability by implementing
 * the GarageStatusListener interface.
 */
public class SpaceAssigner implements GarageStatusListener {
	
	private ParkingGarage garage;
	
	/**
	 * Initiates the SpaceAssigner. This method is called only once per app
	 * start-up.
	 * 
	 * @param garage
	 *            The parking garage for which you are vending spaces.
	 *
	 * O(1) : Assign the given garage object to the member field and ask it to register this object.
	 */
	public void initialize(ParkingGarage garage) {
		this.garage = garage;
		garage.register(this);
	}

	/**
	 * Assigns a space to an incoming car and returns that space.
	 * 
	 * @param car
	 *            The incoming car that needs a space.
	 * @returns The space reserved for the incoming car.
	 *
	 * O(n) : It iterates over the list of available spaces once to find the most desirable and yet available one.
	 */
	public Space assignSpace(Car car) {
		Iterator<Space> iterator = garage.getSpaces();
		if (iterator == null) {
			return null;
		}
		
		MySpace mostDesirable = getMostDesirableSpace(iterator);
		if (mostDesirable == null) {
			return null;
		}
		
		return mostDesirable;
	}
	
	private MySpace getMostDesirableSpace(Iterator<Space> iterator) {
		MySpace mostDesirable = null;
		while(iterator.hasNext()) {
			MySpace candidate = (MySpace) iterator.next();
			if (candidate.isOccupied()) {
				continue;
			}
			if (mostDesirable == null) {
				mostDesirable = candidate;
				continue;
			}
			if (mostDesirable.compareTo(candidate) < 0) {
				mostDesirable = candidate;
			}
		}
		return mostDesirable;
	}

	/**
	 * {@inheritDoc}
	 *
	 * O(1) : Just update the status of space.
	 */
	public void onSpaceTaken(Car car, Space space) {
		MySpace mySpace = (MySpace) space;
		mySpace.setOccupied(true);
		mySpace.setOccupyingCar(car);
	}

	/**
	 * {@inheritDoc}
	 *
	 * O(1) : Just update the status of space.
	 */
	public void onSpaceFreed(Car car, Space space) {
		MySpace mySpace = (MySpace) space;
		mySpace.setOccupied(false);
		mySpace.setOccupyingCar(null);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * O(1) : Just assign null to given Car object.
	 */
	public void onGarageExit(Car car) {
		car = null;
	}
}

package amazon.parking_garage;
import java.util.*;

public class MyParkingGarage implements ParkingGarage {
	
	private GarageStatusListener assigner;
	
	private List<Space> spaces;
	
	public MyParkingGarage(int size, int range) {
		spaces = new ArrayList<Space>();
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			int ID = i;
			int desirability = random.nextInt(range);
			spaces.add(new MySpace(ID, desirability));
		}
	}
	
	@Override
	public void register(GarageStatusListener assigner) {
		this.assigner = assigner;
	}

	@Override
	public Iterator<Space> getSpaces() {
		return spaces.iterator();
	}
	
	public void printStatus() {
		for (Space s : spaces) {
			System.out.println(s);
		}
	}
	
	public void carParked(Car car, Space space) {
		assigner.onSpaceTaken(car, space);
	}
	
	public void spaceEmpty(Space space) {
		assigner.onSpaceFreed(space.getOccupyingCar(), space);
	}

}

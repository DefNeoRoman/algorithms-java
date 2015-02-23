package amazon;

public class MySpace implements Space, Comparable<MySpace> {
	
	private int ID;
	
	private int desirability;

	private boolean occupied;
	
	private Car occupyingCar;
	
	public MySpace(int ID, int desirability) {
		this.ID = ID;
		this.desirability = desirability;
		this.occupied = false; // not occupied
		this.occupyingCar = null; // no car
	}

	@Override
	public int getID() {
		return ID;
	}

	@Override
	public int getDesirability() {
		return desirability;
	}

	@Override
	public boolean isOccupied() {
		return occupied;
	}
	
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	@Override
	public Car getOccupyingCar() {
		return occupyingCar;
	}

	public void setOccupyingCar(Car occupyingCar) {
		this.occupyingCar = occupyingCar;
	}

	@Override
	public int compareTo(MySpace other) {
		return this.desirability - other.desirability;
	}

	@Override
	public String toString() {
		return "MySpace [ID=" + ID + ", desirability=" + desirability + ", occupied=" + occupied + ", occupyingCar=" + occupyingCar + "]";
	}

}

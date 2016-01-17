package amazon.parking_garage;

public class MyCar implements Car {

	private String licensePlateState;
	
	private String licensePlateNumber;
	
	public MyCar(String licensePlateState, String licensePlateNumber) {
		this.licensePlateState = licensePlateState;
		this.licensePlateNumber = licensePlateNumber;
	}

	@Override
	public String getLicensePlateState() {
		return licensePlateState;
	}

	@Override
	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	@Override
	public String toString() {
		return "MyCar [licensePlateState=" + licensePlateState + ", licensePlateNumber=" + licensePlateNumber + "]";
	}

}

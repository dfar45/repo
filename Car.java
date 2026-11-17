package session20;

public class Car implements Movable{
	private String model;
	private String make;
	
	public Car(String model, String make) {
		this.model = model;
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", make=" + make + "]";
	}

	@Override
	public void rotate(int angle) {
		if (angle < 0) {
			System.out.println("rotating Car by "+DEF_ANGLE);
		} else {
			System.out.println("rotating Car by "+angle);
		}
		
	}

	@Override
	public void moveUp(int unit) {
		System.out.println("Moving up the car by "+unit);
		
	}

}

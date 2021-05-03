public class Car {
	private String name;
	private Position position;

	public Car(String name) {
		this.name = name;
		this.position = new Position();
	}

	public void move() {
		position.goForward();
	}

	@Override
	public String toString() {
		return name + " : " + position.toString();
	}
}

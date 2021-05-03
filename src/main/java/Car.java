public class Car {
	private final String positionString = "-";
	private String name;
	private int position;

	public Car(String name) {
		this.name = name;
	}

	public void move() {
		this.position++;
	}

	@Override
	public String toString() {
		String positionToString = "";

		for (int i = 0; i < position; i++) {
			positionToString += positionString;
		}

		return name + " : " + positionToString;
	}
}

public class Position {
	private final String POSITION_STRING = "-";
	private final int INITIAL_POSITION = 0;

	private int position;

	public Position() {
		this.position = INITIAL_POSITION;
	}

	public void goForward() {
		position++;
	}

	public void goBackward() {
		position--;
	}

	@Override
	public String toString() {
		String positionToString = "";

		for (int i = 0; i < position; i++) {
			positionToString += POSITION_STRING;
		}

		return positionToString;
	}
}

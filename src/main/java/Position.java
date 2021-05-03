public class Position {
	private static final String POSITION_STRING = "-";
	private static final int INITIAL_POSITION = 0;

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
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < position; i++) {
			sb.append(POSITION_STRING);
		}

		return sb.toString();
	}
}

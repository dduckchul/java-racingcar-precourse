import java.util.concurrent.ThreadLocalRandom;

public class Racing {
	private static final int MIN_LOOPS = 1;
	private static final int MOVE_MIN_VALUE = 4;
	private static final int MIN_RANDOM_INT = 0;
	private static final int MAX_RANDOM_INT = 9;
	private final int loop;

	public Racing(int loop) {
		validateRace(loop);
		this.loop = loop;
	}

	public void validateRace(int loop) {
		if (loop < MIN_LOOPS) {
			throw new IllegalArgumentException(CarRacingString.RACING_EXCEPTION_MSG);
		}
	}

	public int getLoop() {
		return loop;
	}

	public void doRace(Car car) {
		int randomNum = ThreadLocalRandom.current().nextInt(MIN_RANDOM_INT, MAX_RANDOM_INT);
		if (randomNum >= MOVE_MIN_VALUE) {
			car.move();
		}
	}
}

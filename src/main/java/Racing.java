import java.util.concurrent.ThreadLocalRandom;

public class Racing {
	private static final int MIN_LOOPS = 1;
	private final int loop;

	public Racing(int loop) {
		validateRace(loop);
		this.loop = loop;
	}

	public void validateRace(int loop) {
		if (loop < MIN_LOOPS) {
			throw new IllegalArgumentException("최저 1바퀴를 입력해 주세요");
		}
	}

	public int getLoop() {
		return loop;
	}

	public void doRace(Car car) {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 9);
		if (randomNum >= 4) {
			car.move();
		}
	}
}

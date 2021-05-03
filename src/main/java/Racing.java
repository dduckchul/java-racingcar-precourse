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

	public boolean doRace(){

	}
}

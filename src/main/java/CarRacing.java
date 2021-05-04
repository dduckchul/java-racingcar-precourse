import java.util.List;

public class CarRacing {
	private Racers racers;
	private Racing racing;

	public void hostCarRacing() {
		IoUtils.printMsg(CarRacingString.INPUT_CAR_MSG);
		String racerString = IoUtils.inputString();
		racers = new Racers(racerString);

		IoUtils.printMsg(CarRacingString.INPUT_LOOP_MSG);
		int loops = IoUtils.inputNumbers();
		racing = new Racing(loops);
		IoUtils.printMsg("");
	}

	public void doCarRacing() {
		IoUtils.printMsg(CarRacingString.START_CAR_RACING);
		List<Car> carList = racers.getCarList();
		for (int i = 0; i < racing.getLoop(); i++) {
			driveLoop(carList);
			IoUtils.printMsg("");
		}
	}

	public void driveLoop(List<Car> carList) {
		for (Car car : carList) {
			racing.doRace(car);
			IoUtils.printMsg(car.toString());
		}
	}

	public void announceWinner() {

	}
}

import java.util.List;

public class CarRacing {
	private Racers racers;
	private Racing racing;

	public void hostCarRacing() {
		String racerString = IoUtils.inputString();
		racers = new Racers(racerString);
		int loops = IoUtils.inputNumbers();
		racing = new Racing(loops);
	}

	public void doCarRacing() {
		List<Car> carList = racers.getCarList();
		for (int i = 0; i < racing.getLoop(); i++) {
			driveLoop(carList);
		}
	}

	public void driveLoop(List<Car> carList) {
		for (Car car : carList) {
			racing.doRace(car);
			IoUtils.printMsg(car.toString());
		}
	}
}

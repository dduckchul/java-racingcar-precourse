import java.util.ArrayList;
import java.util.List;

public class Racers {
	private final List<Car> carList;

	public Racers(String carString) {
		validateCarString(carString);
		this.carList = this.stringToCarList(carString);
	}

	public Racers(List<Car> carList) {
		this.carList = carList;
	}

	public List<Car> getCarList() {
		return carList;
	}

	private void validateCarString(String carString) {
		if (carString == null || carString.length() < 1) {
			throw new IllegalArgumentException("빈 문자열은 입력 불가합니다.");
		}
	}

	private List<Car> stringToCarList(String carString) {
		List<Car> list = new ArrayList<>();
		String [] carArray = carString.split(",");
		for (String carName : carArray) {
			list.add(new Car(carName));
		}
		return list;
	}
}

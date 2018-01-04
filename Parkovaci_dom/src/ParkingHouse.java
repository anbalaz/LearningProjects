
public class ParkingHouse {
	private String[] place = new String[4];

	public int parkCar(String car) {
		if (this.isFree() == true) {
			int e;

			e = this.getFreeBox();
			place[e] = car;
			System.out.println(car + " was parked in the box number " + e + ".");
			return e;
		}
		return -1;

	}

	public int unparkCar(String car) {
		for (int i = 0; i < 4; i++) {
			//if (place[i] != null) {
				if (car.equals(place[i])) {
					System.out.println("The " + car + " is being unparked from the box number " + i + ".");
					place[i] = null;
					return i;
				}
			//}
		}
		System.out.println("There is no " + car + " in the Parking house");
		return -1;

	}

	public boolean isFree() {
		for (int i = 0; i < 4; i++) {
			if (place[i] == null) {
				System.out.println("There is free space in the Parking house.");
				return true;
			}
		}
		System.out.println("There is no free space in the Parking house");
		return false;

	}

	public void getCountOfFreeBoxes() {

		int s = 0;

		for (int i = 0; i < 4; i++) {
			if (place[i] == null) {

				s++;
			}
		}
		System.out.println("There are " + s + " free spaces in the Parking house.");

	}

	public int getFreeBox() {

		for (int i = 0; i < 4; i++) {
			if (place[i] == null) {
				System.out.println("The box number " + i + " is free.");
				return i;
			}
		}
		System.out.println("There is no free space in the Parking house");
		return -1;

	}

}

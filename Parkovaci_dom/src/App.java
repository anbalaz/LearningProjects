import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		/*
		 * Car car1 = new Car("Cadillac"); Car car2 = new Car("BMW"); Car car3 = new
		 * Car("Toyota"); Car car4 = new Car("Subaru");
		 */

		ParkingHouse parkHouse1 = new ParkingHouse();
		Window window = new Window(parkHouse1);

		Scanner sc = new Scanner(System.in);
		String command;
		String carName;

		// while (true) {

		do {
			System.out.println("Hello, your command is?");

			command = sc.next();
			if (command.equals("parkCar")) {
				System.out.println("What is the car's name?");
				carName = sc.next();
				parkHouse1.parkCar(carName);
			}

			if (command.equals("unparkCar")) {
				System.out.println("What is the car's name?");
				carName = sc.next();
				parkHouse1.unparkCar(carName);
			}

			if (command.equals("isFree")) {
				parkHouse1.isFree();
			}

			if (command.equals("getCountOfFreeBoxes")) {
				parkHouse1.getCountOfFreeBoxes();
			}

			if (command.equals("getFreeBox")) {
				parkHouse1.getFreeBox();
			}
			
			window.repaintCanvas();

		} while (!command.equals("exit"));

		// if (command.equals("exit")) { break; } }

	}

}

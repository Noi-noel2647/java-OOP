package confirm14Q1;

public class Confirm14Q1 {

	public static void main(String[] args) {

		Bus bus = new Bus();
		PatrolCar policeCar = new PatrolCar();

		bus.put(5);
		bus.drive(20);
		bus.drop(3);

		policeCar.siren();
		policeCar.drive(10);

	}

}

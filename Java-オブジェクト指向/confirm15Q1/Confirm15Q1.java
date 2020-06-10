package confirm15Q1;

public class Confirm15Q1 {

	public static void main(String[] args) {

		Sparrow inst1 = new Sparrow();
		Penguin inst2 = new Penguin();

		System.out.println("スズメは");
		inst1.move();
		inst1.eat();

		System.out.println("ペンギンは");
		inst2.move();
		inst2.eat();

	}

}

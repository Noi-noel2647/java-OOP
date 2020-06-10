package confirm15Q2_2;

import confirm15Q2.AdultSparrow;

public class Confirm15Q2_2 {

	public static void main(String[] args) {

		AdultSparrow inst1 = new AdultSparrow();
		AdultPenguin inst2 = new AdultPenguin();

		System.out.println("スズメは");
		inst1.move();
		inst1.eat();

		System.out.println("ペンギンは");
		inst2.move();
		inst2.eat();

	}

}

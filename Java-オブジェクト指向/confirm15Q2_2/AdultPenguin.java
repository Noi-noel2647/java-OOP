package confirm15Q2_2;

import confirm15Q1.Penguin;

public class AdultPenguin extends Penguin {

	@Override
	public void move() {
		System.out.print("凄い速さで");
		super.move();

	}

	@Override
	public void eat() {
		System.out.print("結構大きな");
		super.eat();
		System.out.println("飢えを凌ぎます。");

	}

}

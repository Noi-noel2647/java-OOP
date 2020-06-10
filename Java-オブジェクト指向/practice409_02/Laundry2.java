package practice409_02;

public class Laundry2 extends Laundry1 {

	@Override
	public void wash(String clothWash) {

		super.wash(clothWash);
		System.out.println(clothWash + "にアイロンをかけました。");

	}

}

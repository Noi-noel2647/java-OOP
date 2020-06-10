package confirm13Q2;

public class Confirm13Q2 {

	public static void main(String[] args) {

		int result;
		Arithmetic instanceA;
		instanceA = new Arithmetic();

		result = instanceA.calculate(12);
		System.out.println("数値を1つ[12]渡した結果\t\t：" + result);

		result = instanceA.calculate(123, 11);
		System.out.println("数値を2つ[123, 11]渡した結果\t：" + result);

		result = instanceA.calculate(12, 62, 847);
		System.out.println("数値を3つ[12, 62, 847]渡した結果：" + result);

	}

}

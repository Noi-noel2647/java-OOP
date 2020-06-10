package confirm13Q2_2;

public class Confirm13Q2_2 {

	public static void main(String[] args) {

		int result;
		double result2;
		Arithmetic instanceA;
		instanceA = new Arithmetic();

		result = instanceA.calculate(12);
		System.out.println("int型の数値を1つ[12]渡した結果\t\t\t：" + result);

		result = instanceA.calculate(123, 11);
		System.out.println("int型の数値を2つ[123, 11]渡した結果\t\t：" + result);

		result = instanceA.calculate(12, 62, 847);
		System.out.println("int型の数値を3つ[12, 62, 847]渡した結果\t\t：" + result);

		result2 = instanceA.calculate(6.9);
		System.out.println("double型の数値を1つ[6.9]渡した結果\t\t：" + result2);

		result2 = instanceA.calculate(8.5, 1.64);
		System.out.println("double型の数値を2つ[8.5, 1.64]渡した結果\t：" + result2);

		result2 = instanceA.calculate(9.4, 8.9, 6.64);
		System.out.println("double型の数値を3つ[9.4, 8.9, 6.64]渡した結果\t：" + result2);

	}

}

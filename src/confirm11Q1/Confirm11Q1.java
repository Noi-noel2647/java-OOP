package confirm11Q1;

public class Confirm11Q1 {

	public static void main(String[] args) {

		int result;
		CalcNomal class1 = new CalcNomal();

		result = class1.add(1, 2);
		System.out.println("Nomalの加算結果：" + result);

		result = CalcStatic.add(3, 4);
		System.out.println("Staticの加算結果：" + result);

		result = class1.subtaract(13, 7);
		System.out.println("Nomalの滅算結果：" + result);

		result = CalcStatic.subtaract(32, 15);
		System.out.println("Staticの滅算結果：" + result);

	}

}

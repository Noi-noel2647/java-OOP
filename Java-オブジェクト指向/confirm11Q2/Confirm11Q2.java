package confirm11Q2;

import java.io.*;

public class Confirm11Q2 {

	public static void main(String[] args) throws IOException {

		int result, num1, num2;
		CalcNormal class1 = new CalcNormal();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		result = class1.add(num1, num2);
		System.out.println("Normalの加算結果：" + result);

		result = CalcStatic.add(num1, num2);
		System.out.println("Staticの加算結果：" + result);

		result = class1.subtaract(num1, num2);
		System.out.println("Normalの滅算結果：" + result);

		result = CalcStatic.subtaract(num1, num2);
		System.out.println("Staticの滅算結果：" + result);

	}

}

package confirm12Q1;

public class Confirm12Q1 {

	public static void main(String[] args) {

		VariableCheck a, b;

		a = new VariableCheck();
		b = new VariableCheck();

		for(int n = 0; n < 50; n++) {
			a.plus();
			b.minus();

		}

		System.out.println("プラス側のクラス変数 \t\t：" + a.classVariable);
		System.out.println("プラス側のインスタンス変数 \t：" + a.instanceVariable);
		System.out.println("マイナス側のクラス変数 \t\t：" + b.classVariable);
		System.out.println("マイナス側のインスタンス変数 \t：" + b.instanceVariable);


	}

}

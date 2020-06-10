package practice406_01;

public class Mult {

			int multiple;
	static	int c_times = 0;
			int i_times = 0;

	Mult(int num) {
		multiple = num;
		System.out.println(multiple + "倍にするインスタンスが生成されました");

	}

	public int calc(int value) {
		int answer;

		answer = value * multiple;
		c_times++;
		i_times++;
		return answer;

	}

	public void display() {
		System.out.println(multiple + "倍するインスタンスの");
		System.out.println(" インスタンス変数(i_times)は\t" + i_times);
		System.out.println(multiple + "倍するインスタンスの");
		System.out.println(" クラス変数(c_times)は\t\t" + c_times);

	}

}

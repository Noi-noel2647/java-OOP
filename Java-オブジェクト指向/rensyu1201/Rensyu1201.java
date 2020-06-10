package rensyu1201;

public class Rensyu1201 {

	public static void main(String[] args) {

		Calc calcA, calcB;
		int mode;

		calcA = new Calc(10);
		calcB = new Calc(100);

		mode = Rensyu1201.randomNum(4);
		calcA.modeChange(mode);

		mode = Rensyu1201.randomNum(4);
		calcB.modeChange(mode);

	}


	/*
	 * 1～num以下の乱数を生成し、返却するメソッド
	 * @param num
	 * @return randomNum
	 */
	static int randomNum(int num) {
		int randomNum;

		randomNum = (int)(Math.random() * num) +1;
		System.out.println("ランダムで生成された値は " + randomNum + " です");
		return randomNum;

	}

}

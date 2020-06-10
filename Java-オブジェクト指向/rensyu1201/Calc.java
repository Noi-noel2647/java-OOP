package rensyu1201;

public class Calc {

	int multiple, total, random;
	static int sum_total = 0;

	/* コンストラクタ */
	 Calc(int num) {
		 multiple = num;

	 }


	 void modeChange(int mode) {

		 switch(mode) {

		 case 1:
			 calc_add();
			 break;

		 case 2:
			 calc_sub();
			 break;

		 case 3:
			 calc_mul();
			 break;

		 case 4:
			 calc_div();
			 break;

		default:
			total = 0;
			break;

		 }

		 sum_total += total;
		 System.out.println("今回の答えは " + total + " です。");
		 System.out.println("今までの合計は " + sum_total + " です。");
		 System.out.println();

	 }

	 void calc_add() {

		 random = Rensyu1201.randomNum(100);
		 total = random + multiple;

		 System.out.println("加算が選択されました。");
		 System.out.println(random + " + " + multiple + "を計算します。");

	 }

	 void calc_sub() {

		 random = Rensyu1201.randomNum(100);
		 total = random - multiple;

		 System.out.println("減算が選択されました。");
		 System.out.println(random + " - " + multiple + "を計算します。");

	 }

	 void calc_mul() {

		 random = Rensyu1201.randomNum(100);
		 total = random * multiple;

		 System.out.println("乗算が選択されました。");
		 System.out.println(random + " × " + multiple + "を計算します。");

	 }

	 void calc_div() {

		 random = Rensyu1201.randomNum(100);
		 total = random / multiple;

		 System.out.println("除算が選択されました。");
		 System.out.println(random + " ÷ " + multiple + "を計算します。");

	 }




}

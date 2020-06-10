package confirm12Q2;


public class Confirm12Q2 {

	int[] distribution =  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

	public static void main(String[] args) {

		Confirm12Q2 c1, c2;

		c1 = new Confirm12Q2();
		c2 = new Confirm12Q2();

		c1.randomNum();
		c2.randomNum();

		for(int i = 0; i < 10; i++) {
			System.out.println("[" + i + "]が出た回数：" + (c1.distribution[i] + c2.distribution[i]));
		}

	}

	void randomNum() {

		int i, ret;

		for(i = 0; i < 10; i++) {
			ret = (int)(Math.random() * 10);
			distribution[ret]++;

		}

	}

}

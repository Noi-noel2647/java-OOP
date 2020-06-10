package practice407_01;

public class Addition {

	int ans_to_addA;
	double ans_to_addB;

	public void add(int value1, int value2) {
		add(value1, value2, 0);
	}

	public void add(int value1, int value2, int value3) {
		ans_to_addA = value1 + value2 + value3;
		System.out.println(ans_to_addA);

	}

	public void add(double value1, double value2) {
		ans_to_addB = value1 + value2;
		System.out.println(ans_to_addB);

	}
}

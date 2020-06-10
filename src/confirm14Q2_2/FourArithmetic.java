package confirm14Q2_2;

public class FourArithmetic extends AddSubtract {

	void multiply(int no1, int no2) {

		result = 0;

		for(int n = 1; n <= no2; n++) {
			result = result + no1;

		}

	}

	void divide(int no1, int no2) {

		result = 1;

		while(no1 > no2) {
			no1 -= no2;
			result++;

		}

	}

}

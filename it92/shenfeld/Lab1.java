package it92.shenfeld;

public class Lab1 {
	public static void main(String[] args) {
		// O1 : +
		// O2 : *
		// type : double

		final int C = 9225 % 3;

		int a = 3;
		int b = 4;
		int n = 10;
		int m = 10;


		float s = 0;

		if (!(n < a || m < b) || a > -C || n < -C) {

			double j = (b + m) / 2 * (m - b + 1);
			for (double i = a; i <= n; i++) {
				s += (i * j) / (i + C);
			}
		} else {
			System.out.println("Zero division");
			return;
		}
		System.out.println("S = " + s);
	}
}

package it92.shenfeld;

public class Lab1 {
	public static void main(String[] args) {
		// O1 : +
		// O2 : *
		// type : double

		// Constant C with value c3
		final int C = 9225 % 3;

		int a = 3;
		int b = 4;
		int n = 10;
		int m = 10;

		// Result sum
		float s = 0;

		if (!(n < a || m < b) || a > -C || n < -C) {
			// Arithmetic sum of j
			double j = (b + m) / 2 * (m - b + 1);
			for (double i = a; i <= n; i++) {
				s += (double) (i * j) / (i + C);
			}
		} else {
			System.out.println("Zero division");
			return;
		}
		System.out.println("S = " + s);
	}
}

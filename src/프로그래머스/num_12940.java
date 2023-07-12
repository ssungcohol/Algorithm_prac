package 프로그래머스;

public class num_12940 {
	public static void main(String[] args) {

		int n = 3;
		int m = 12;

		int gcd = 1;
		int lcm = 0;

		for (int i = 1; i <= n && i <= m; i++) {
			if (n % i == 0 && m % i ==0) {
				gcd = i;
			}
		}

		lcm = (n * m) / gcd;


		System.out.println("GCD = " + gcd);
		System.out.println("LCM = " + lcm);

	}
}

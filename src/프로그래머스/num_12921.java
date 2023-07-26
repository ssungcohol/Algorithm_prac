package 프로그래머스;


public class num_12921 {
	public static boolean[] prime;
	public static void main(String[] args) {
		int n = 10;
		int answer = 0;

		prime_check(n);

		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false) {
				answer++;
			}
		}
		System.out.println(answer);
	}

	public static void prime_check(int n) {

		prime = new boolean[n + 1];

		if (n < 2) {
			return;
		}

		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(n); i++) {

			if(prime[i] == true) {
				continue;
			}

			for (int j = i * i; j < prime.length; j = j + i) {
				prime[j] = true;
			}
		}
	}
}

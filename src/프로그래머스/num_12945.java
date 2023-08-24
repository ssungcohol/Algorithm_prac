package 프로그래머스;

public class num_12945 {
	public static void main(String[] args) {
		int n = 5;
		int answer = 0;

		// F(2) = F(0) + F(1) = 0 + 1 = 1
		// F(3) = F(1) + F(2) = 1 + 1 = 2
		// F(4) = F(2) + F(3) = 1 + 2 = 3
		// F(5) = F(3) + F(4) = 2 + 3 = 5
		// F(0) = 0, F(1) = 1

		// ================================================
		// int[] fibo = new int[n + 1];
		//
		// for (int i = 0; i < n; i++) {
		// 	if(i == 0) {
		// 		fibo[i] = 0;
		// 	} else if(i == 1) {
		// 		fibo[i] = 1;
		// 	} else {
		// 		int sum = fibo[i - 1] + fibo[i - 2];
		// 		fibo[i] = sum % 1234567;
		// 	}
		// }
		// System.out.println(fibo[n]);
		// ===============================================

		if(n == 1 || n == 0) {
			answer = 1;
		}

		int a = 0;
		int b = 1;

		for (int i = 2; i <= n; i++) {
			answer = (a + b) % 1234567;
			a = b;
			b = answer;
		}

		System.out.println(answer);
	}
}
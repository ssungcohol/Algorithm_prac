package 프로그래머스;

public class num_120871 {
	public static void main(String[] args) {
		int n = 15;
		int answer = 0;

		// 3의 배수와 3을 사용하지 않는다

		for (int i = 1; i <= n; i++) {
			answer++;

			while (answer % 3 ==0 || String.valueOf(answer).contains("3")) {
				answer++;
			}
		}

		System.out.println(answer);
	}
}

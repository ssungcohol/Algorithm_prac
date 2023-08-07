package 프로그래머스;

public class num_120922 {
	public static void main(String[] args) {
		int M = 2;
		int N = 5;

		int answer = 0;

		if(M == 1 && N == 1) {
			answer = 0;
		} else if (M == 1) {
			answer = M * (N - 1);
		} else if (N == 1) {
			answer = (M - 1);
		} else {
			answer = (M - 1) + M * (N - 1);
		}

		System.out.println(answer);
	}
}

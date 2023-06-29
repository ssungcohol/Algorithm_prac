package 프로그래머스;

public class num_120848 {
	public static void main(String[] args){

		int n = 3;

		int cnt = 1;

		int answer = 1;

		for (int i = 1; i <= n; i++) {
			cnt *= i;
			if(cnt > n) {
				answer = i - 1;
				break;
			} else if (n == 2) {
				answer = 0;
			}
		}

		System.out.println(answer);
	}
}

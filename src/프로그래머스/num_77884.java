package 프로그래머스;

public class num_77884 {
	public static void main(String[] args) {

		int left = 13;
		int right = 17;

		int result = 0;

		// 약수의 개수가 짝수는 더하고, 홀수는 빼고

		for (int i = left; i <= right; i++) {
			int cnt = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt++;
				}
			}
			if(cnt % 2 == 0) {
				result += i;
			} else {
				result -= i;
			}
		}

		System.out.println(result);
	}
}

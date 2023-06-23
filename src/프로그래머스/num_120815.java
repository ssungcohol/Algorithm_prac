package 프로그래머스;

public class num_120815 {
	public static void main(String[] args) {
		// 피자 조각의 개수는 6개, 사람은 n명
		int n = 10;
		int answer = 1;

		while((6 * answer) % n != 0 ) {
			answer++;
		}
		System.out.println(answer);
	}
}

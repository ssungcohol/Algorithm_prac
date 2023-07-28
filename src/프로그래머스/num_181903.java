package 프로그래머스;

public class num_181903 {
	public static void main(String[] args) {

		int q = 3;
		int r = 1;
		String code = "qjnwezgrpirldywt";

		String answer = "";

		for (int i = 0; i < code.length(); i++) {
			if (i % q == r) {
				answer += code.charAt(i);
			}
		}

		System.out.println(answer);
	}
}

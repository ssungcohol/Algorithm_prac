package 프로그래머스;

public class num_120891 {
	public static void main(String[] args) {

		int order = 29423;
		int answer = 0;

		String str = Integer.toString(order);

		String[] s = str.split("");

		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("3") || s[i].equals("6") || s[i].equals("9")) {
				answer++;
			}
		}

		System.out.println(answer);

	}
}

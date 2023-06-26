package 프로그래머스;

public class num_120904 {
	public static void main(String[] args) {
		int num = 29183;
		int k = 1;
		int answer = 0;

		String str = Integer.toString(num);
		String[] s = str.split("");

		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(String.valueOf(k))) {
				answer = i + 1;
				break;
			} else answer = -1;
		}

		System.out.println(answer);
	}
}

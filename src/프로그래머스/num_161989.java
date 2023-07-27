package 프로그래머스;

public class num_161989 {
	public static void main(String[] args) {

		int n = 8;
		int m = 4;
		int[] section = {2, 3, 6};

		int answer = 1;

		int  start = section[0];

		for (int i = 1; i < section.length; i++) {
			if (start + m - 1 < section[i]) {
				answer++;
				start = section[i];
			}
		}

		System.out.println(answer);

	}
}

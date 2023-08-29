package 프로그래머스;

import java.util.Arrays;

public class num_142086 {
	public static void main(String[] args) {

		String s ="banana";
		//[-1 -1 -1 2 2 2]

		int[] answer = new int[s.length()];

		answer[0] = -1;
		for (int i = 1; i < s.length(); i++) {
			int x = s.lastIndexOf(s.substring(i, i+1), i -1);

			if (x == -1) {
				answer[i] = x;
			} else answer[i] = i - x;
		}

		System.out.println(Arrays.toString(answer));

	}
}

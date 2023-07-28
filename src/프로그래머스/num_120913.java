package 프로그래머스;

import java.util.Arrays;

public class num_120913 {
	public static void main(String[] args) {

		String my_str = "abc1Addfggg4556b";
		int n = 6;

		System.out.println(my_str.length());

		String[] answer = new String[(my_str.length() + n -1) / n];

		for (int i = 0; i < answer.length; i++) {
			int start = n * i;
			int end = 0;
			if (start + n >= my_str.length()) {
				end = my_str.length();
			} else {
				end = start + n;
			}
			answer[i] = my_str.substring(start, end);
		}

		System.out.println(Arrays.toString(answer));

	}
}

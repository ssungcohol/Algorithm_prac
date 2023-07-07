package 프로그래머스;

import java.util.Arrays;

public class num_181886 {
	public static void main(String[] args) {

		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		// "nami", "vex"

		String[] answer;

		if (names.length % 5 == 0) {
			answer = new String[names.length / 5];
		} else {
			answer = new String[names.length / 5 + 1];
		}

		int idx = 0;
		for (int i = 0; i < names.length; i += 5) {
			answer[idx] = names[i];
			idx++;
		}

		System.out.println(Arrays.toString(answer));

	}
}

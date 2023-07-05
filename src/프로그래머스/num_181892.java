package 프로그래머스;

import java.util.Arrays;

public class num_181892 {
	public static void main(String[] args) {

		int[] num = {5, 2, 1, 7, 5};
		int n = 2;

		// int[] answer = {};

		// if (num.length == n) {
		// 	answer = new int[1];
		// 	answer[0] = num[n -1];
		// 	System.out.println(Arrays.toString(answer)	);
		// } else {
		// 	answer = new int[num.length - (n - 1)];
		// 	for (int i = 0; i < num.length - (n - 1); i++) {
		// 		answer[i] = num[i + 1];
		// 	}
		// 	System.out.println(Arrays.toString(answer));
		// }

		int[] answer = new int[num.length - n + 1];

		for (int i = n - 1; i < num.length; i++) {
			answer[i - n + 1] = num[i];
		}

		System.out.println(Arrays.toString(answer));
	}
}

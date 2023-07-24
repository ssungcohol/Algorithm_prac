package 프로그래머스;

import java.util.Arrays;

public class num_135808 {
	public static void main(String[] args) {
		int k = 4;
		int m = 3;

		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

		int answer = 0;

		// int[][] arr = new int[score.length / m][m];

		Arrays.sort(score);

		System.out.println(Arrays.toString(score));

		for (int i = score.length - 1; i >= 0; i--) {
			if((score.length - i) % m == 0) {
				answer += score[i] * m;
			}
		}

		System.out.println(answer);

	}
}

package 프로그래머스;

import java.util.Arrays;

public class num_181888 {
	public static void main(String[] args) {

		int[] num_list = {4, 2, 6, 1, 7, 6};

		int n = 2;

		int[] answer;

		if (num_list.length % n == 0) {
			answer = new int[num_list.length / n];
		} else {
			answer = new int[num_list.length / n + 1];
		}

		int cnt = 0;
		for(int i = 0; i < num_list.length; i += n) {
			answer[cnt++] = num_list[i];
		}

		System.out.println(Arrays.toString(answer));

	}
}

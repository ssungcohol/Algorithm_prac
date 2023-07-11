package 프로그래머스;

import java.util.Arrays;

public class num_181891 {
	public static void main(String[] args) {

		int[] num_list = {2, 1, 6};

		int n = 1;

		String str = "";

		int[] answer = new int[num_list.length];

		for (int i = n; i < num_list.length; i++) {
			str += num_list[i];
		}

		for (int i = 0; i < n; i++) {
			str += num_list[i];
		}

		answer = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();

		System.out.println(answer);


	}
}

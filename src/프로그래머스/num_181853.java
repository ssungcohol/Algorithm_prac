package 프로그래머스;

import java.lang.reflect.Array;
import java.util.Arrays;

public class num_181853 {
	public static void main(String[] args) {

		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		//[1, 4, 12, 14, 15]

		Arrays.sort(num_list);

		int[] answer = new int[5];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i];
		}

		System.out.println(Arrays.toString(answer));
	}
}

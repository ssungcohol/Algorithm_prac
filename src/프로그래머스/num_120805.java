package 프로그래머스;

import java.util.Arrays;

public class num_120805 {
	public static void main(String[] args) {

		String my_string = "hi12392";

		my_string = my_string.replaceAll("[a-z]", "");

		String[] arr = my_string.split("");
		int[] answer = new int[arr.length];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(arr[i]);
		}

		Arrays.sort(answer);

		System.out.println(answer);

	}
}

// 	my_string	result
// "hi12392"	[1, 2, 2, 3, 9]
// 	"p2o4i8gj2"	[2, 2, 4, 8]
// 	"abcde0"	[0]
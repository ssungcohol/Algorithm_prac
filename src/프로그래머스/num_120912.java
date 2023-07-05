package 프로그래머스;

import java.util.Arrays;

public class num_120912 {
	public static void main(String[] args) {

		int[] arr = {7, 77, 17};

		String str = Arrays.toString(arr);

		String[] str1 = str.split("");

		int answer = 0;

		for (int i = 0; i < str.length(); i++ ) {
			if (str1[i].equals("7")) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}

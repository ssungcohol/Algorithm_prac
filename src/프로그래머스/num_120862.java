package 프로그래머스;

import java.util.Arrays;

public class num_120862 {
	public static void main(String[] args) {

		int[] numbers = {1, 2, -3, 4, -5};
		int answer = 0;

		Arrays.sort(numbers);

		int a = numbers[0] * numbers[1];
		int b = numbers[numbers.length-2] * numbers[numbers.length-1];

		if (a > b) {
			answer = a;
		} else answer = b;

		System.out.println(answer);
	}
}

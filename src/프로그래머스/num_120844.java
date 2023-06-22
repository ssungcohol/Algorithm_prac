package 프로그래머스;

import java.util.Arrays;

public class num_120844 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		int[] answer = new int[numbers.length];
		String direction = "right";
		int num = 0;

		if (direction.equals("right")) {
			num = numbers[numbers.length - 1];
			for (int i = numbers.length - 1; i >= 1; i--) {
				answer[i] = numbers[i - 1];
			}
			answer[0] = num;
		} else {
			num = numbers[0];
			for (int i = 0; i < numbers.length - 1; i++) {
				answer[i] = numbers[i + 1];
			}
			answer[numbers.length - 1] = num;
		}

		System.out.println(Arrays.toString(answer));
	}
}

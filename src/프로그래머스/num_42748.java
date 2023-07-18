package 프로그래머스;

import java.util.Arrays;

public class num_42748 {
	public static void main(String[] args) {

		int[] array = {1, 5, 2, 6, 3, 7, 4};

		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] tmp = new int[commands[i][1] - commands[i][0] + 1];
			System.arraycopy(array, commands[i][0] - 1, tmp, 0, commands[i][1] - commands[i][0] + 1);
			Arrays.sort(tmp);
			answer[i] = tmp[commands[i][2] - 1];
		}

		System.out.println(Arrays.toString(answer));

	}
}

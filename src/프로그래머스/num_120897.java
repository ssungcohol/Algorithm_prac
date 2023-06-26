package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class num_120897 {
	public static void main(String[] args) {
		int n = 24;
		int[] array = new int[10000];
		int index = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				array[index] = i;
				index++;
			}
		}
		int[] answer = new int [index];
		for (int i = 0; i < index; i++) {
			if (array[i] != 0) {
				answer[i] = array[i];
			}
		}

		System.out.println(answer);
	}
}

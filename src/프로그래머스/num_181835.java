package 프로그래머스;

import java.util.Arrays;

public class num_181835 {
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 100, 99, 98};

		int k = 2;

		if(k % 2 == 1) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] * k;
			}
		} else
			for (int i = 0; i < arr.length; i++) {
				arr[i] = arr[i] + k;
			}

		System.out.println(Arrays.toString(arr));
	}
}

package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class num_68644 {
	public static void main(String[] args) {

		int[] numbers = {2, 1, 3, 4, 1};

		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 0; i < numbers.length; i++) {
			// list.add(numbers[i]);
			for(int j = i + 1; j < numbers.length; j++) {
				if(!list.contains(numbers[i] + numbers[j])) {
					list.add(numbers[i] + numbers[j]);
				}
			}
		}

		Collections.sort(list);

		int[] answer = new int[list.size()];

		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		System.out.println(Arrays.toString(answer));

	}
}

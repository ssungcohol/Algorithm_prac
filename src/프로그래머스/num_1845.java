package 프로그래머스;

import java.util.ArrayList;

public class num_1845 {
	public static void main(String[] args) {
		int[] nums = {3, 1, 2, 3};

		int answer = 0;

		// int[] arr = new int[nums.length / 2];

		ArrayList<Integer> list = new ArrayList<>();

		int have = nums.length / 2;

		for(int i = 0; i < nums.length; i++) {
			if (!list.contains(nums[i])) {
				list.add(nums[i]);
			}
		}

		if(have == list.size() || have <= list.size()) {
			answer = have;
		} else {
			answer = list.size();
		}

		System.out.println(answer);
	}
}

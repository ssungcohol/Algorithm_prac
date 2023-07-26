package 프로그래머스;

public class num_12977 {
	public static void main(String[] args) {

		int[] nums = {1, 2, 7, 6, 4};

		int answer = 0;
		boolean check = false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {

					int sum = nums[i] + nums[j] + nums[k];

					if (sum >= 2) {
						check = prime(sum);
					}
					if (check == true) {
						answer++;
					}
				}
			}
		}

		System.out.println(answer);
	}

	public static boolean prime(int sum) {
		boolean check = true;
		if(sum == 2) {
			return check;
		}

		for (int i = 2; i < sum; i++) {
			if(sum % i == 0) {
				check = false;
				break;
			}
		}

		return check;
	}
}

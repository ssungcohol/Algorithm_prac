package 프로그래머스;

public class num_131705 {
	public static void main(String[] args) {

		int[] number = {-3, -2, -1, 0, 1, 2, 3};

		int cnt = 0;

		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				for (int k = j + 1; k < number.length; k++) {
					if(number[i] + number[j] + number[k] == 0)
						cnt++;
				}
			}
		}

		System.out.println(cnt);

	}
}

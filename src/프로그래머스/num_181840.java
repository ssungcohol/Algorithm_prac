package 프로그래머스;

public class num_181840 {
	public static void main(String[] args) {

		int[] num_list = {15, 95, 2, 23, 15};
		int n = 20;
		int answer = 0;

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] == n) {
				answer = 1;
			}
		}

		System.out.println(answer);
	}
}

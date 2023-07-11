package 프로그래머스;

public class num_181911 {
	public static void main(String[] args) {

		String[] my_string = {"progressive", "hamburger", "hammer", "ahocorasick"};

		int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

		String answer = "";

		// System.out.println(parts[0][1]);

		// for (int i = 0; i < my_string.length; i++) {
		// 	for (int j = 0; j < 2; j++) {
		// 		for (int k = parts[i][0]; k <= parts[i][j]; k++) {
		// 			answer += my_string[i].charAt(k);
		// 		}
		// 	}
		// }

		for (int i = 0; i < my_string.length; i++) {

			String str = my_string[i];

			answer += str.substring(parts[i][0], parts[i][1]+1);

		}

		System.out.println(answer);

	}
}

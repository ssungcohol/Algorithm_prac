package 프로그래머스;

import java.util.Arrays;

public class num_120902 {
	public static void main(String[] args) {

		String my_string = "3 + 4";

		String[] str = my_string.split(" ");

		int answer = Integer.parseInt(str[0]);
		System.out.println(Arrays.toString(str));

		// if (my_string.contains("+")) {
		// 	answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
		// }else {
		// 	answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
		// }

		for (int i = 1; i < str.length - 1; i += 2) {
			if(str[i].equals("+")) {
				answer += Integer.parseInt(str[i + 1]);
			} else if (str[i].equals("-")){
				answer -= Integer.parseInt(str[i + 1]);
			}
		}

		System.out.println(answer);
	}
}

package 프로그래머스;

import java.util.Arrays;

public class num_120896 {
	public static void main(String[] args) {

		String s = "hello";

		String answer = "";

		String[] str = s.split("");

		Arrays.sort(str);

		for (int i = 0; i < str.length; i++) {
			int cnt = 0;
			for (int j = 0; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					cnt++;
				}
			}

			if(cnt == 1) {
				answer += str[i];
			}
		}


		System.out.println(answer);
	}
}

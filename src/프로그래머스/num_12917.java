package 프로그래머스;

import java.util.Arrays;
import java.util.Collections;

public class num_12917 {
	public static void main(String[] args) {

		String s = "Zbcdefg";

		String answer = "";

		String[] str = s.split("");

		Arrays.sort(str, Collections.reverseOrder());

		for(int i = 0; i < str.length; i++) {
			answer += str[i];
		}

		System.out.println(answer);

	}
}

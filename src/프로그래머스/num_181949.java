package 프로그래머스;

import java.lang.reflect.Array;
import java.util.Arrays;

public class num_181949 {
	public static void main(String[] args) {
		String str = "aBcDeFg";
		String answer = "";

		String[] s = str.split("");

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLowerCase(c)) {
				answer += Character.toUpperCase(c);
			} else {
				answer += Character.toLowerCase(c);
			}
		}

		System.out.println(answer);

	}
}

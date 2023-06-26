package 프로그래머스;

import java.util.Arrays;

public class num_120911 {
	public static void main(String[] args) {

		String my_string = "Bcad";

		my_string = my_string.toLowerCase();

		char[] charArr = my_string.toCharArray();
		Arrays.sort(charArr);

		String answer = new String(charArr);

		System.out.println(answer);
	}
}

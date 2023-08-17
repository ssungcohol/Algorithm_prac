package 프로그래머스;

import java.util.Arrays;

import javax.imageio.ImageTranscoder;

public class num_12939 {
	public static void main(String[] args) {
		String s = "-1 -1";
		String answer = "";

		int min = 0;
		int max = 0;

		String[] str = s.split(" ");

		min = Integer.parseInt(str[0]);
		max = Integer.parseInt(str[1]);

		for (int i = 0; i < str.length; i++) {

			if(min > Integer.parseInt(str[i])) {
				min = Integer.parseInt(str[i]);
			} else if (max <= Integer.parseInt(str[i])) {
				max = Integer.parseInt(str[i]);
			}

		}

		answer += min;
		answer += " ";
		answer += max;

		System.out.println(answer);
	}
}

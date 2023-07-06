package 프로그래머스;

import java.util.Arrays;

public class num_181875 {
	public static void main(String[] args) {

		String[] strArr = {"AAA","BBB","CCC","DDD"};

		//["aaa","BBB","ccc","DDD"]

		String[] answer = new String[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
			if(i % 2 == 0) {
				answer[i] = strArr[i].toLowerCase();
			} else {
				answer[i] = strArr[i].toUpperCase();
			}
		}

		System.out.println(Arrays.toString(answer));
	}
}

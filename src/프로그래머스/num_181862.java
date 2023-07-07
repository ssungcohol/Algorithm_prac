package 프로그래머스;

import java.util.Arrays;

public class num_181862 {
	public static void main(String[] args) {

		String my_string = "i love you";

		String[] answer = my_string.trim().split("\\s+");

		System.out.println(Arrays.toString(answer));

	}
}

package 프로그래머스;

import java.util.Arrays;

public class num_120868 {
	public static void main(String[] args) {

		int[] sides = {11, 7};
		int answer = 0;

		Arrays.sort(sides);

		// 가장 긴 변이 11일 때
		for (int i = 1; i <= sides[1]; i++) {
			if(sides[0] + i > sides[1]) {
				answer++;
			}
		}

		System.out.println(answer);

		// 나머지 한 변이 가장 길 때
		for (int i = 0; i < sides[0] + sides[1]; i++) {
			if(i > sides[1] && sides[0] + sides[1] > i) {
				answer++;
			}
		}

		System.out.println(answer);
	}
}

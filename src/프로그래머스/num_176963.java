package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class num_176963 {
	public static void main(String[] args) {

		String[] name = {"may", "kein", "kain", "radi"};

		int[] yearning = {5, 10 ,1, 3};

		String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein","brin", "deny"}, {"kon", "kain", "may", "coni"}};

		// [19, 15, 6]

		int[] answer = new int[photo.length];

		// ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < photo.length; i++) {
			for(int j = 0; j < photo[i].length; j++) {
				if(Arrays.asList(name).indexOf(photo[i][j]) != -1) {
					answer[i] += yearning[Arrays.asList(name).indexOf(photo[i][j])];
				}
			}
		}

		System.out.println(Arrays.toString(answer));
	}
}

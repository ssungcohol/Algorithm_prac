package 프로그래머스;

import java.util.Arrays;

public class num_120861 {
	public static void main(String[] args) {
		String[] keyinput = {"down", "down", "down", "down", "down"};
		int[] board = {7, 9};

		int[] answer = {0, 0};

		for (int i = 0; i < keyinput.length; i++) {
			if(keyinput[i].equals("left")) {
				 answer[0]--;
				 if(answer[0] < -(int)(board[0] / 2))
					 answer[0] = -(int)(board[0] / 2);
			} else if(keyinput[i].equals("right")) {
				answer[0]++;
				if(answer[0] > (int)(board[0] / 2))
					answer[0] = (int)(board[0] / 2);
			} else if(keyinput[i].equals("down")) {
				answer[1]--;
				if(answer[1] < -(int)(board[1] / 2))
					answer[1] = -(int)(board[1] / 2);
			} else {
				answer[1]++;
				if(answer[1] > (int)(board[1] / 2))
					answer[1] = (int)(board[1] / 2);
			}
		}
	}
}

package 프로그래머스;

import java.util.Arrays;
import java.util.Stack;

public class num_12906 {
	public static void main(String[] args) {

		int[] arr = {1,1,3,3,0,1,1};

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			if(stack.size() == 0 || arr[i] != stack.peek()) stack.push(arr[i]);
		}

		int[] answer = new int[stack.size()];

		for(int i = stack.size()-1; i >= 0; i--) {
			answer[i] = stack.pop();
		}

		System.out.println(Arrays.toString(answer));
	}
}

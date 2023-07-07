package 프로그래머스;

public class num_181834 {
	public static void main(String[] args) {

		String myString = "abcdevwxyz";

		String answer = "";

		for (int i = 0; i < myString.length(); i++) {
			if(myString.charAt(i) < 108) {
				answer += "l";
			}
			else {
				answer += myString.charAt(i);
			}
		}

		System.out.println(answer);

	}
}

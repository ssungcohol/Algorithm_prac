package 프로그래머스;

public class num_12926 {
	public static void main(String[] args) {

		String s = "a B z";
		int n = 4;

		// String[] str = s.split("");
		//
		String answer = "";
		//
		// for (int i = 0; i < str.length; i++) {
		// 	if(str[i].equals("z")) {
		// 		answer += "a";
		// 	} else if (str[i].equals("Z")) {
		// 		answer += "A";
		// 	} else {
		// 		answer += str[i].charAt(str[i] + 1);
		// 	}
		// }


		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == ' ') {
				answer += " ";
				continue;
			}

			if (Character.isLowerCase(ch)) {
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			} else if (Character.isUpperCase(ch)) {
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			}

			answer += ch;
		}

		System.out.println(answer);

	}
}

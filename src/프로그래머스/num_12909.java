package 프로그래머스;

public class num_12909 {
	public static void main(String[] args) {
		String s = "()()()((())()()()()()";
		boolean answer = true;


		if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
			answer = false;
		} else {
			int cnt = 0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '(') {
					cnt++;
				} else {
					cnt--;
				}

				if (cnt < 0) {
					answer = false;
					break;
				}
			}
			if(cnt != 0) {
				answer = false;
			}
		}



		System.out.println(answer);
	}
}

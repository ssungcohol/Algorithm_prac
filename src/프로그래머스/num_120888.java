package 프로그래머스;

public class num_120888 {
	public static void main(String[] args) {

		String my_string = "people";

		String answer = "";

		// String[] str = my_string.split("");

		// for (int i = 0; i < str.length; i++) {
		// 	for (int j = i + 1; j < str.length; j++) {
		// 		if (str[i].equals(str.toString(j)))
		// 	}
		// }

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.indexOf(my_string.charAt(i)) == i) {
				answer += my_string.charAt(i);
			}
		}

		System.out.println(answer);

	}
}

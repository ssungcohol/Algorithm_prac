package 프로그래머스;

public class num_181943 {
	public static void main(String[] args) {
		String my_string = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int s = 2;

		String answer = "";

		String last_string = my_string.substring(overwrite_string.length() + s, my_string.length());

		System.out.println(last_string);

		my_string = my_string.substring(0, s);

		System.out.println(my_string);

		answer = my_string + overwrite_string + last_string;

		System.out.println(answer);
	}
}

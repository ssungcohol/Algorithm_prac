package 프로그래머스;

public class num_120895 {
	public static void main(String[] args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;

		String answer = "";

		String[] str = my_string.split("");

		String temp = str[num1];
		str[num1] = str[num2];
		str[num2] = temp;

		System.out.println(String.join("", str))	;

	}
}

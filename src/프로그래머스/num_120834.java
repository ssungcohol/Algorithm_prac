package 프로그래머스;

public class num_120834 {
	public static void main(String[] args) {
		int age = 100;
		String answer = "";

		String str = Integer.toString(age);

		String[] str1 = str.split("");

		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equals("0")) {
				answer += "a";
			} else if (str1[i].equals("1")) {
				answer += "b";
			} else if (str1[i].equals("2")) {
				answer += "c";
			} else if (str1[i].equals("3")) {
				answer += "d";
			} else if (str1[i].equals("4")) {
				answer += "e";
			} else if (str1[i].equals("5")) {
				answer += "f";
			} else if (str1[i].equals("6")) {
				answer += "g";
			} else if (str1[i].equals("7")) {
				answer += "h";
			} else if (str1[i].equals("8")) {
				answer += "i";
			} else if (str1[i].equals("9")) {
				answer += "j";
			}
		}
		System.out.println(answer);

	}
}

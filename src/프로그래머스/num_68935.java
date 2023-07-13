package 프로그래머스;

public class num_68935 {
	public static void main (String[] args) {

		int n = 45;
		String str = "";

		int answer = 0;

		while (n > 0) {
			str += n % 3 ;
			n = n / 3;
		}

		answer = Integer.parseInt(str, 3);

		System.out.println(str);
		System.out.println(n);
		System.out.println(answer);

	}
}

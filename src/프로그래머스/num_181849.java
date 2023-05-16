package 프로그래머스;

public class num_181849 {
	public static void main (String[] args) {

		String num_str = "123456789";
		int answer = 0;

		String[] num_str_list = num_str.split("");

		for(int i = 0; i < num_str_list.length; i++) {
			answer += Integer.parseInt(num_str_list[i]);
		}

		System.out.println(answer);

	}

}

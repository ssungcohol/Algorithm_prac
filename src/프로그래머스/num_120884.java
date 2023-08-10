package 프로그래머스;

public class num_120884 {
	public static void main(String[] args) {
		int chicken = 1999;
		int answer = 0; // service chicken

		int etc = 0;

		while (chicken > 0) {
			answer += chicken / 10;
			etc += chicken % 10;
			chicken = chicken / 10;
			if(etc >= 10) {
				answer += 1;
				chicken += 1;
				etc -= 10;
			}
		}


		System.out.println(answer);
	}
}

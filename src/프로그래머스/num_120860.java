package 프로그래머스;

public class num_120860 {
	public static void main(String[] args) {
		int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
		int answer = 0;

		// answer = Math.abs(dots[2][0] - dots[0][0]) * Math.abs(dots[3][1] - dots[0][1]);

		int w = 0;
		int h = 0;
		int x = dots[0][0];
		int y = dots[0][1];

		for (int i = 1; i < dots.length; i++) {
			if (x != dots[i][0]) w = Math.abs(x - dots[i][0]);
			if (y != dots[i][0]) h = Math.abs(y - dots[i][0]);
		}

		answer = w * h;

		System.out.println(answer);

	}
}

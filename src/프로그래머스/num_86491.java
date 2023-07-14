package 프로그래머스;

public class num_86491 {
	public static void main(String[] args) {

		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

		//sizes.length = 5,

		int max_r = 0;
		int max_c = 0;

		for (int i = 0; i < sizes.length; i++) {
			if(sizes[i][0] < sizes[i][1]) {
				int tmp = sizes[i][0];
				sizes[i][0] = sizes[i][1];
				sizes[i][1] = tmp;
			}
			if(max_r < sizes[i][0]) max_r = sizes[i][0];
			if(max_c < sizes[i][1]) max_c = sizes[i][1];
		}

		int size = max_r * max_c;

		System.out.println(size);
	}
}

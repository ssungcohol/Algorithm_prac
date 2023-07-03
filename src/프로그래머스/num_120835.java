package 프로그래머스;

public class num_120835 {
	public static void main(String[] args) {

		int[] emergency = {1, 2, 3, 4, 5, 6, 7};

		int[] arr = new int[emergency.length];


		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (emergency[i] < emergency[j]) {
					arr[i]++;
				}
			}
			arr[i]++;
		}

		System.out.println(arr);
	}

}

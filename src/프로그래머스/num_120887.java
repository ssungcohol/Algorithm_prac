package 프로그래머스;

public class num_120887 {
	public static void main(String[] args) {

		int i = 10;
		int j = 50;
		int k = 5;

		String str = "";

		int cnt = 0;

		String strk = String.valueOf(k);

		for (int a = i; a <= j; a++) {
			str = a + "";

			String[] arr = str.split("");
			for (int b = 0; b < arr.length; b++) {
				if(arr[b].contains(strk)) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}
}

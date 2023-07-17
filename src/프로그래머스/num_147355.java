package 프로그래머스;

import java.lang.reflect.Array;
import java.util.Arrays;

public class num_147355 {
	public static void main(String[] args) {

		String t = "10203";
		String p = "15";

		int cnt = 0;


		// String[] t_arr = new String[t.length() - p.length() + 1];
		//
		// for (int i = 0; i < t_arr.length; i++) {
		//
		// 	t_arr[i] = t.substring(i, i+3);
		// }
		//
		// for(int j = 0; j < t_arr.length; j++) {
		// 	if (Integer.parseInt(t_arr[j]) <= Integer.parseInt(p)) {
		// 		cnt++;
		// 	}
		// }

		int p_len = p.length();
		Long num = Long.parseLong(p);

		for (int i = 0; i < t.length() - p_len; i++) {
			if(Long.parseLong(t.substring(i, i + p_len)) <= num) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}

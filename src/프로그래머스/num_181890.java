package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class num_181890 {
	public static void main(String[] args) {
		String[] str_list = {"u", "u", "l", "r"};

		ArrayList<String> list = new ArrayList<String>();

		int cnt = -1;

		for (int i = 0; i < str_list.length; i++) {
			cnt++;
			if(str_list[i].equals("l")) {
				for (int j = 0; j < cnt; j++) {
					list.add(str_list[j]);
				}
				break;
			} else if (str_list[i].equals("r")) {
				for (int j = cnt + 1; j < str_list.length; j++) {
					list.add(str_list[j]);
				}
				break;
			}
		}

		System.out.println(cnt);
		System.out.println(list);

		String[] answer = list.toArray(new String[list.size()]);

		System.out.println(Arrays.toString(answer));

	}
}

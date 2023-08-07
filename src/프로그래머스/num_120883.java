package 프로그래머스;

import org.w3c.dom.ls.LSOutput;

public class num_120883 {
	public static void main(String[] args) {
		String[] id_pw = {"rabbit04", "98761"};
		String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};

		String answer = "";

		for (int i = 0; i < db.length; i++) {

			if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
				answer = "login";
			} else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
				answer = "wrong pw";
				break;
			} else answer = "fail";
		}

		System.out.println(answer);
	}
}

package 프로그래머스;

import java.math.BigInteger;

public class num_181846 {
	public static void main(String[] args) {

		String a = "582";
		String b = "734";

		BigInteger c = new BigInteger(a);
		BigInteger d = new BigInteger(b);

		String answer = String.valueOf(c.add(d));

		System.out.println(answer);

	}
}

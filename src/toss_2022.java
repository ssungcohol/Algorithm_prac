public class toss_2022 {
	public static void main (String[] args) {

		int biggest = -1;

		String s = "12223";
		String s1 = "111333999";
		String s2 = "123"; // -1

		for (int i = 0; i < s1.length() - 2; i++) {
			if(s1.indexOf(s1.charAt(i)) == s1.indexOf(s1.charAt(i + 1)) && s1.indexOf(s1.charAt(i + 1)) == s1.indexOf(s1.charAt(i + 2))) {
				biggest = Integer.parseInt(s1.substring(i, i + 3));
			}
		}

		System.out.println(biggest);
	}
}

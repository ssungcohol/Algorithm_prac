package 프로그래머스;

public class num_120851 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";

        my_string = my_string.replaceAll("[^0-9]", "");

        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }

        System.out.println(answer);

    }
}


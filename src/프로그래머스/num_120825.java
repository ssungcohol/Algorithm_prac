package 프로그래머스;

public class num_120825 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        String answer = "";

        int m = my_string.length();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        System.out.println(answer);
    }
}

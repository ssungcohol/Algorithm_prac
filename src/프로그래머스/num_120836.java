package 프로그래머스;

public class num_120836 {
    public static void main(String[] args) {
        int n = 100;
        int answer = 0;
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                idx++;
            }
        }
        answer = idx;

        System.out.println(answer);
    }
}

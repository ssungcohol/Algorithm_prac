package 프로그래머스;

public class num_120903 {
    public static void main(String[] args) {

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        int answer = 0;

        int l1 = s1.length;
        int l2 = s2.length;

        for(int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if(s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}

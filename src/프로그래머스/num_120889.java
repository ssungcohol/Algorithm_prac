package 프로그래머스;

import java.util.Arrays;

public class num_120889 {
    public static void main(String[] args) {
        int[] sides = {1, 2, 3};

        int answer = 0;

        Arrays.sort(sides);

        if (sides[2] >= sides[0] + sides[1]) {
            answer = 2;
        } else {
            answer = 1;
        }

        System.out.println(answer);
    }
}

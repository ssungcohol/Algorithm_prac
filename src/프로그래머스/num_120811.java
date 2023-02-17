package 프로그래머스;

import java.util.Arrays;

public class num_120811 {
    public static void main(String[] args) {

        int[] array = {9, -1, 0};

        int answer = 0;

        Arrays.sort(array);

        int n = (array.length / 2);

        answer = array[n];

        System.out.println(answer);

    }
}

//array	                result
//[1, 2, 7, 10, 11]	    7
//[9, -1, 0]	        0

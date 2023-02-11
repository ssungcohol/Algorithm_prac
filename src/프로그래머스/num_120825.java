package 프로그래머스;

import java.lang.annotation.IncompleteAnnotationException;

public class num_120825 {
    public static void main (String[] args) {
        String my_string = "hello";
        int m = my_string.length();
        int n = 3;

        String r = "";

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                r += my_string.charAt(i);
            }
        }

        System.out.println(r);


    }
}


//  my_string	n	result
//  "hello"	    3	"hhheeellllllooo"
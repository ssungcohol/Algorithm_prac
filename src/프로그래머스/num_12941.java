package 프로그래머스;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class num_12941 {
	public static void main(String[] args) {
		int[] A = {1, 2};
		int[] B = {3, 4};
		int answer = 0;

		Arrays.sort(A);
		Integer[] C = Arrays.stream(B).boxed().toArray(Integer[]:: new);
		Arrays.sort(C, Collections.reverseOrder());

		System.out.println(Arrays.toString(C));

		for (int i = 0; i < A.length; i++) {
			answer += A[i] * C[i];
		}

		System.out.println(answer);

	}
}

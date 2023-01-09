package algorithm.doit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class star {
	private String star = "*";
	private String space = " ";
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringBuilder sb = new StringBuilder();

	void triangleLB(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++)
				sb.append(star);
			sb.append("\n");
		}
		System.out.println(sb);
	}

	void triangleLU(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--)
				sb.append(star);
			sb.append("\n");
		}
		System.out.println(sb);
	}

	void triangleRU(int n) {
		for (int i = 0; i < n; i++) {

			// space = 해당 줄의 순서만큼 배로 증가
			for (int s = i; s > 0; s--)
				sb.append(space);

			// space = 해당 줄의 순서만큼 배로 감소
			for (int j = n - i; j > 0; j--) {
				sb.append(star);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	void triangleRB(int n) {
		for (int i = n; i > 0; i--) {

			// space = 해당 줄의 순서만큼 배로 증가
			for (int s = i-1; s > 0; s--)
				sb.append(space);

			// space = 해당 줄의 순서만큼 배로 감소
			for (int j = n-i+1; j > 0; j--) {
				sb.append(star);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	void spria(int n) {
		for(int i=0; i<n; i++) {
		}
	}

	void npira(int n) {

	}
}

public class PracSolve_40pg {

	public static void main(String[] args) {
		star Star = new star();

		Star.spria(4);
	}

}

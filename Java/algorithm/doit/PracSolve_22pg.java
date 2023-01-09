package algorithm.doit;

public class PracSolve_22pg {
	public static void main(String[] args) {
		System.out.println(max4(25, 2, 3, 4));
		System.out.println(min4(25, 2, 3, 4));
		System.out.println(min3(25, -5, 3));
	}

	static int max4(int a, int b, int c, int d) {
		int[] arr = new int[] {a, b, c, d};
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr [i]) {
				max = arr [i];
			}
		}

		return max;

	}

	static int min3(int a, int b, int c) {
		int[] arr = new int[] {a, b, c};
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr [i]) {
				min = arr [i];
			}
		}

		return min;
	}

	static int min4(int a, int b, int c, int d) {
		int[] arr = new int[] {a, b, c, d};
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr [i]) {
				min = arr [i];
			}
		}

		return min;
	}
}

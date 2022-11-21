package study;

public class permutation {

	public static void main(String[] args) {
		
		// arr 순열 n개 중에서 r개를 뽑기
		int n = 3;
		int[] arr = {1,2,3};
		int r = 3;
		
		permutation(arr, 0, n, r);
		
	}
	
	// 순열 구하기: 순서 없이 n개중에서 r개를 뽑는 경우
	static void permutation (int[] arr, int depth, int n, int r) {
		if(depth == r) {
			print(arr, r);
			return;
		}
		
		for(int i=depth; i<n ; i++) {
			swap(arr, depth, i);
			permutation(arr, depth+1, n, r);
			swap(arr, depth, i);
		}
	}
	
	static void swap(int[] arr, int depth, int i) {
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}
	
	static void print(int[] arr, int r) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<r; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}

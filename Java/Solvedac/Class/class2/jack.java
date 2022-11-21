package Solvedac.Class.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class jack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] firstInput = br.readLine().split(" ");
		String[] secondInput = br.readLine().split(" ");
		int N = Integer.parseInt(firstInput[0]); //카드 개수
		int M =Integer.parseInt(firstInput[1]); // 합의 근사치 기준
		
		int[] intArrN = new int[N];
		
		//카드 숫자를 담은 int 배열
		for(int i=0; i<N; i++)
			intArrN[i] = Integer.parseInt(secondInput[i]);
				
		//3장의 순열을 더한 배열 생성기
		permutation(intArrN, 0, intArrN.length, 3);	

	}
	
	// 순열 구하기: 순서 없이 n개중에서 r개를 뽑는 경우
		static void permutation (int[] arr, int depth, int n, int r) {
			
			if(depth == r) {
				sum(arr, r) ;
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
		
		//3개의 합 생성.
		static int sum(int[] arr, int r) {
			int sum = 0;
			for(int i=0; i<r; i++) {
				sum += arr[i];
			}
			System.out.println(sum);
			return sum;
		}

}

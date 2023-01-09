package programmers.lv1;

public class Desc {
	public static void main(String[] args) {
		long n = 118372;
		String answer = "";

		String[] strArr = Long.toString(n).split("");
		int inputLen = strArr.length-1;

		int[] intArr = new int[strArr.length];
		char[] charArr = new char[strArr.length];

		for (int i = 0; i < inputLen; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}

		for(int j=0; j<inputLen; j++) {
			for(int i=0; i<inputLen; i++) {
				if(intArr[i]<intArr[i+1]) {
					int tmp = intArr[i+1];
					intArr[i+1] = intArr[i];
					intArr[i] = tmp;
				}
			}
		}
		
		for(int i=0; i<strArr.length; i++) {
			answer += intArr[i];
		}
		
		System.out.println(answer);
		
	}
}

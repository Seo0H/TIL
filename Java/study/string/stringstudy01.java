package study.string;

public class stringstudy01 {
	public static void main(String[] args) {
		String str = "Hello world!";
		
		for(int i = 0; i<str.length(); i++) {
			System.out.println(str.charAt(i)+" ");
		}
		System.out.println("원본 문자열: " + str);
	}
	

}

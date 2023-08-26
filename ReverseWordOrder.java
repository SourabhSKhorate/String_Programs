package String;

public class ReverseWordOrder {
	
	public static void reverseWord(String str) {
		String s[] = str.split("");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(s[i]);
		}
	}

	public static void main(String[] args) {
		String s1= "Hello Good Morning";
		reverseWord(s1);
	}

}

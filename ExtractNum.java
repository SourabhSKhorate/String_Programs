package String;

public class ExtractNum {
	public static int sumFormString(String str) {
		String num="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				num=num+str.charAt(i);
		}
	}
		int n= Integer.parseInt(num);
		int sum=0;
		while(n>0) {
			int lastdigit= n%10;
			sum= sum+lastdigit;
			n=n/10;
		}
		return sum;
}
	

	public static void main(String[] args) {
		String s="a1b2c3d4";
		System.out.println(sumFormString(s));

	}

}

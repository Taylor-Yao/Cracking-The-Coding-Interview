public class reverseWords {
	
	public static String reverseWords(String s){
		int len = s.length();
		int count = 0;
		char reverse[] = new char[len+1];
		reverse[0] = ' ';
		for(int i=len-1;i>=0;i--){
			reverse[++count] = s.charAt(i);
		}
		String ss = new String(reverse);
		return ss;
	}
	
	public static void main(String args[]){
		String s = "fjalsjfkl";
		String r = reverseWords(s);
		System.out.println(r);
	}

}

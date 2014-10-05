
public class isUnique {
	
	public static boolean isUnique(String s){
		boolean a[] = new boolean[256];
		for(int i=0; i<s.length(); i++){
			int temp = (int)s.charAt(i);
			if(a[temp]){
				return false;
			}else{
				a[temp]=true;
			}
		}
		return true;
		
	}

	public static void main(String args[]){
		String s = "abc";
		boolean ans;
		ans = isUnique(s);
		System.out.println(ans);
	}
}

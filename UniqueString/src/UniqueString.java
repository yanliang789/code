
public class UniqueString {
	 public static void main(String[] args) {
	        System.out.println("Is string unique: " + isStringUnique("abcdefg"));
	    }
	 
	 private static boolean isStringUnique(String str) {
		 boolean[] charSet = new boolean[256];
		 if(str == null || str.length() == 0) {
			 return true;
		 }
		 for (int i = 0; i < str.length(); i++ ) {
			 if(charSet[str.charAt(i)])
				 return false;
			 charSet[str.charAt(i)] = true;
		 }
		 return true;
	 }
}

package linkedlistPractice;

public class Q1_01_Is_Unique {

	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for(String word: words) {
			System.out.println(word + ": " + isUnique(word));
		}

	}
	
	
	public static boolean isUnique(String str) {
		if(str.length() > 128) {
			return false;
		}
		
		boolean[] char_set = new boolean[128];
		for(int i =0; i< str.length(); i++) {
			int val = str.charAt(i);
			if(char_set[val]) return false;
			char_set[val] = true;
		}
		
		return true;
		
	}

}

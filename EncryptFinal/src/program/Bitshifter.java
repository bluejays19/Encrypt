package program;

public class Bitshifter {
	
	private static final int[] chain = {
			1941, 1239, 28374, 3092, 201, 29, 293, 23412
	};
	
	public static String encrypt(String key) {
		String result = "";
		int l = key.length();
		char ch;
		int ck = 0;
		for(int i = 0; i < l; i++){
			if(ck >= chain.length - 1) ck = 0;
			ch = key.charAt(i);
			ch += chain[ck];
			result += ch;
			ck++;
		}
		
		return result;
	}
	
	public static String decrypt(String key) {
		String result = "";
		int l = key.length();
		char ch;
		int ck = 0;
		for(int i = 0; i < l; i++){
			if(ck >= chain.length - 1) ck = 0;
			ch = key.charAt(i);
			ch -= chain[ck];
			result += ch;
			ck++;
		}
		
		return result;
	}
	
}

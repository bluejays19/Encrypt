
public class Bitshifter {

	private static final int [] chain ={
	
	1931, 12394, 23093, 9023, 2111, 193, 93, 293 
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String encrypt(String key) {
		// TODO Auto-generated method stub
		String result = "";
		int l = key.length();
		char ch;
		int ck = 0;
		for (int i = 0; i < l; i++){
			if (ck >= chain.length-1) ck = 0; 
			ch = key.charAt(i);
			ch += chain [ck];
			result += ch;
			ck++;
			}	
			
		return result;
		
	}
			



public static String decrypt(String key) {
	// TODO Auto-generated method stub
	String result = "";
	int l = key.length();
	char ch;
	int ck = 0;
	for (int i = 0; i < l; i++){
 		if(ck>= chain.length -1) ck=0;
		ch = key.charAt(i);
		ch -= chain[ck];
		result += ch;
		ck++;
		
		}	
		
	return result;
	
}}

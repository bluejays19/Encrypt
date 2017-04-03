
public class encryptionProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String passcode = Bitshifter.encrypt("Hello, my name is Daniel.");
		System.out.println(Bitshifter.encrypt(passcode)); 
	DataWriter.write(passcode);
	}

}

package c;

public class Encryption {
	private int numChars;
	private int[] cipher;
	private String unencrypted;
	public Encryption(int n, String cipher, String message){
		numChars = n;
		unencrypted = message;
		this.cipher = new int[n];
		for(int i = 0; i < n; i++){
			try{
				this.cipher[i] = Integer.parseInt(cipher.substring(0, cipher.indexOf(" ")));
			}
			catch (StringIndexOutOfBoundsException e) {
				this.cipher[i] = Integer.parseInt(cipher);
			}
				cipher = cipher.substring(cipher.indexOf(' ') + 1);
		}
	}
	
	public int[] getCipher(){
		return cipher;
	}
}

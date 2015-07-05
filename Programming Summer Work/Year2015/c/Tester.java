package c;

public class Tester {
	public static void main(String[] args){
		Encryption test = new Encryption(3, "5 2 46", "bzy");
		int[] cipher = test.getCipher();
		for(int x : cipher)
			System.out.println(x);
	}
}

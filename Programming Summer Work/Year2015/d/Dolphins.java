package d;

public class Dolphins {
	private String a, b;
	private String[] aWords, bWords;
	
	public Dolphins(String a, String b){
		this.a = a;
		this.b = b;
		aWords = a.split(" ");
		bWords = b.split(" ");
	}
}

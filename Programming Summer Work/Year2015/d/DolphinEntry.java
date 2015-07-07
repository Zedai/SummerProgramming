package d;

public class DolphinEntry {
	private int wordLength, instance;
	
	public DolphinEntry(int wL, int i){
		wordLength = wL;
		instance = i;
	}
	
	public void increase(int num){
		instance += num;
	}
	
	public int getwordLength(){
		return wordLength;
	}
	
	public int getInstance(){
		return instance;
	}
}

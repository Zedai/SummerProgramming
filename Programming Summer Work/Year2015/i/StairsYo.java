package i;

import java.util.ArrayList;

public class StairsYo {

	public StairsYo(int n) {
		int possibleSteps = 0;
		ArrayList<int[]> methods = new ArrayList<int[]>();
		methods.add(new int[n]);
		
		while(stepHeight(methods.get(possibleSteps)) < n){
			
		}

	}

	public int stepHeight(int[] steps) {
		int sum = 0;
		for (int i : steps) {
			sum += i;
		}
		return sum;
	}

}

package a;

import java.util.ArrayList;

public class DayCare {
	private int num;
	private int[] entries;
	
	public DayCare(int num, int[] entries){
		this.num = num;
		if(num >= 1 && num <= 10000)
		this.entries = entries;
	}
	
	public void output(){
		detChildrenLeft();
		System.out.println(num);
		for(int i = 0; i < num; i++){
			System.out.print(entries[i] + " ");
		}
	}
	
	private void detChildrenLeft()
	{
		ArrayList<Integer> entriesLeft = new ArrayList<Integer>();
		for(int i = 0; i < num - 1; i++)
		{
			for(int j = i + 1; j < num; j++)
			{
				if(entries[i] == entries[j])
					entriesLeft.add(entries[i]);
					
			}
		}
		
		int[] newEntries = new int[entriesLeft.size()];
		for(int i = 0; i < entriesLeft.size(); i++)
		{
			newEntries[i] = entriesLeft.get(i);
		}
		
		entries = newEntries;
	}
}

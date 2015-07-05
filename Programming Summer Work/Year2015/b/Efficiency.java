package b;

import java.util.ArrayList;

public class Efficiency {

	private int[][] availableRoutes; //x = rows
	                                 // y = [row, col]
	public Efficiency(int[][] availableRoutes)
	{
		this.availableRoutes = availableRoutes;
	}
	
	public int getWorstCaseScenario()
	{
		int numScenarios = 0;
		return numScenarios;
	}
	
	public int getBestCaseScenario()
	{
		int numScenarios = 0;
		return numScenarios;
	}
	
	public void output()
	{
		System.out.println(getNumCities());
		for(int i = 0; i < availableRoutes.length; i++)
		{
			for(int j = 0; j < availableRoutes[0].length; j++)
			{
				System.out.println(i + " " + availableRoutes[i][j]);
			}
		}
	}
	
	private int getNumCities()
	{
		ArrayList<Integer> cities = new ArrayList<Integer>();
		for(int i = 0; i < availableRoutes.length; i++)
		{
			for(int j = 0; j < availableRoutes[0].length; j++)
			{
				if(!cities.contains(availableRoutes[i][j]))
				{
					cities.add(availableRoutes[i][j]);
				}
			}
		}
		
		return cities.size();
	}
}

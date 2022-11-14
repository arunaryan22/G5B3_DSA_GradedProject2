package org.greatlearning.dsa.problem1;

import java.util.*;

public class SkyscaperConstruction {

	public static void OrderOfConstruction(ArrayList<Integer> a, int noOffloors) 
	{
		// find maximum size of floors from the size of array

		int maxFloor = a.size();

		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 1; i <= a.size(); i++)
		{

			temp.add(i - 1, a.get(i - 1));

			if (temp.contains(maxFloor))
			{
				// if floor size from input matches max floor then display max floor on that day
				// check if floors less then current floor is also present and display it
				System.out.print("Day: " + i + "\n" + maxFloor);
				Collections.sort(temp);
				Collections.reverse(temp);
				--maxFloor;
				if (maxFloor != 0)
				{
					for (int j = 0; j < temp.size(); j++) 
					{
						if (temp.get(j) == maxFloor)
						{
							System.out.print(" " + maxFloor);
							--maxFloor;
						}
						
					}
					System.out.println();
				}

			}

			else {
				
				System.out.println("Day: " + i + "\n");

			}

		}

	}

}

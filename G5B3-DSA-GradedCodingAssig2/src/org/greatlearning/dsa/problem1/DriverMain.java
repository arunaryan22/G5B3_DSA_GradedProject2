package org.greatlearning.dsa.problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverMain {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SkyscaperConstruction skyscraper = new SkyscaperConstruction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building\n");
		int totalFloors = sc.nextInt();

		// Declare arraylist to store the input floors
		ArrayList<Integer> floor = new ArrayList<>();

		for (int i = 1; i <= totalFloors; i++)
		{
			System.out.println("Enter the floor size given on day: " + i);
			int sizeOfFloor = sc.nextInt();
			floor.add(sizeOfFloor);
		}
		

		// order of construction
		System.out.println("The order of construction is as follows:\n");
		skyscraper.OrderOfConstruction(floor, totalFloors);

	}
}

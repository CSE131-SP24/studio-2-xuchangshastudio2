package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money are you starting with?");
		int startAmount = in.nextInt(); 
		System.out.println("What is the probability of winning each play? Please enter as decimal (ex: 0.5 is 50%).");
		double winChance = in.nextDouble();
		System.out.println("How much money do you need before you stop?");
		int winLimit = in.nextInt();
		System.out.println("How many days are you playing?");
		int totalSimulations = in.nextInt();
		
		int winDays = 0;
		
		for(int day = 1; day <= totalSimulations; day++)
		{
			int amount = startAmount;
			while(amount < winLimit && amount > 0)
			{
				double A = Math.random();
				if (A < winChance)
				{
					System.out.println("WIN");
					amount ++;
				}
				else
				{
					System.out.println("L :P");
					amount = amount - 1;
				}
			}
			
			if (amount == 0)
			{
				System.out.println("Rip you're broke");
			}
			else if (amount == winLimit)
			{
				System.out.println("You won");
				winDays++;
			}
		}
		
		System.out.println("You won " + winDays + " days");
		double win=winDays;
		double winRate = win/totalSimulations;
		System.out.println("Your win rate is: " + winRate);
		double ruinRate = (totalSimulations - win)/totalSimulations;
		System.out.println("Your ruin rate is: " + ruinRate);

	}
}

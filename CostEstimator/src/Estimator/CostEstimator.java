package Estimator;

import java.util.Scanner;

import java.io.FileDescriptor;

import java.io.PrintStream;

import java.io.FileOutputStream;

class calculate
{
	public int addcost (int choice,int area,int automate)
	{
		
	  int price = 0;
	  
	  //If choice is 0 then this part will work.
	  if(automate == 0)  
	  {
		  
		if(choice == 1)
			
		{
			price = area * 1200;
		}
		
		else if(choice == 2)
		{
			price = area * 1500;
		}
		
		else if(choice == 3)
		{
			price = area * 1800;
		}
		
	  }
	  
	  //If choice is 1 then this part will work.
	  else
	  {
		  
		if(choice == 3)
			
		{
			price = area * 2500;
		}
		
	  }
	  
		return price;
	}
}

public class CostEstimator {

	public static void main(String[] args)
	{
		//PrintStream is used here for printing output without using System.out.println.
		PrintStream output = new PrintStream (new FileOutputStream (FileDescriptor.out));
		
	    int area, automate = 0, choice = 0, testcase;
		
	    Scanner scan = new Scanner (System.in);
		
	  //Test case will start from here.
	    output.println ("Enter testcases: ");
		
	    testcase = scan.nextInt();
		
	    while(testcase != 0 )	
		{
			output.println ("Enter area of house: ");
			
			area = scan.nextInt();
			
			//From here you can make selection of your choice.
			output.println ("Select your choice of standard: ");
			
			output.println ("Enter 1 for use standard materials: ");
			
			output.println ("Enter 2 for use above standard materials: ");
			
			output.println ("Enter 3 for use high standard materials: ");
			
			choice = scan.nextInt();
			
			//This while loop is use to check whether entered selection is correct or not.
			while (choice > 3 || choice < 1)     
		      {
		    	  output.println ("Please enter correct selection: ");
		    	  
		    	  choice = scan.nextInt (); 
		      }
			
			//If choice is 1 or 2 then automation will be always 0.
			if(choice == 1 || choice == 2)
			{
				automate = 0;
			}
			
			//If choice is 3 then you can choose do you want automation or not.
			else
			{
				output.println("Choose that you want automation or not: ");
				
				output.println("Enter 0 for no automation: ");
				
				output.println("Enter 1 for full automation: ");
				
				automate=scan.nextInt();
				
			}
			
			//Call class Task to print output
			calculate abc = new calculate();
			
			int final_price = abc.addcost(choice, area, automate);
			
			output.println(final_price);
			
			testcase = testcase - 1;
			
		}
	    
		scan.close();
	}

}

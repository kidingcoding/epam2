package interest;

import java.io.FileDescriptor;

import java.io.FileOutputStream;

import java.io.PrintStream;

import java.util.*;

class CalculateSimple
{
	public float Simple (float profit, float rate, float time)
	{
		//From here we will get simple interest and return it to main
		float SimpleIntrest = profit * rate * time / 100;
		return SimpleIntrest;
	}
}
class CalculateCompound
{
	public double Compound (float profit, float rate, float time)
	{
		//From here we will get compound interest and return it to main
		double CompoundIntrest = Math.pow ((1 + rate / 100), time);
		return CompoundIntrest;
	}
}
public class SimpleAndCompoundInterest {

	public static void main (String[] args)
	{	
		
		Scanner scan = new Scanner (System.in);
		//PrintStream is used here for printing output without using System.out.println.
	    PrintStream output = new PrintStream (new FileOutputStream (FileDescriptor.out));
	    
	    int testcase;
	    
	    output.println ("Enter your testcase: ");
	    
	    testcase = scan.nextInt ();
	    
	  //Test case will start from here.
	    while (testcase != 0)
	    {
	    	float profit, rate, time;
			
	    	double compoundIntrest;
			
	    	double simpleIntrest;
	    	
	    	output.println ("Enter profit: ");
			
		    profit = scan.nextFloat();
		    
		    output.println ("Enter rate percentage: ");
			
		    rate = scan.nextFloat();
		    
		    output.println ("Enter time in years: ");
			
		    time = scan.nextFloat();
		    
		  //Call class CalculateSimple and create object of this class
		    CalculateSimple a = new CalculateSimple();
		    
		    //Calculated simple interest
		    simpleIntrest = a.Simple (profit, rate, time);
		    
		    output.println ("Simple intrest is: " + simpleIntrest);
		    
		  //Call class CalculateCoumpound and create object of this class
		    CalculateCompound b = new CalculateCompound();
		    
		    //Calculated compound interest
		    compoundIntrest = b.Compound (profit, rate, time);
		    
		    output.println ("Compound intrest is: " + compoundIntrest);
		    
		    testcase = testcase - 1;
	    }
	    output.println ("Thankyou");
	    scan.close ();   
	}
}

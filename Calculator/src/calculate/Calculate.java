package calculate;

import java.util.Scanner;

import java.io.FileDescriptor;

import java.io.PrintStream;

import java.io.FileOutputStream;

public class Calculate
{
  
public static void main (String[]args)
  {
	  Scanner scan = new Scanner (System.in);
    
      //PrintStream is used here for printing output without using System.out.println.
      PrintStream output = new PrintStream (new FileOutputStream (FileDescriptor.out));
    
      //Test case will start from here.
      output.println ("Enter your testcase: ");
    
      int testcase;
    
      testcase = scan.nextInt ();
    
      while (testcase != 0)
    	  
      {
    	  
    	  int operand1, operand2, variable, selection;
    	  
    	  output.println ("Please enter two digit: ");
    	  
    	  operand1 = scan.nextInt ();
    	  
    	  operand2 = scan.nextInt ();
	
	      //From here we can make selection that which task we want to perform.
	      output.println ("Make your selection: ");
	      
	      output.println ("Enter 1 for Addition");
	      
	      output.println ("Enter 2 for Multiplication");
	      
	      output.println ("Enter 3 for Division");
	      
	      selection = scan.nextInt ();
	
	      //This while loop is use to check whether entered selection is correct or not.
	      while (selection > 3 || selection < 1)
	      
	      {
	    	  output.println ("Please enter correct selection: ");
	    	  
	    	  selection = scan.nextInt (); 
	      }
	
	      //Call class Task to print output
	      Task abc = new Task ();
	
	      //If selection will be 1 then addition will be performed.
	      if (selection == 1)
	      {
	    	  variable = abc.addition (operand1, operand2);
	    	  
	    	  output.println ("Answer is: " + variable);  
	      }
	
	      //If selection will be 2 then multiplication will be performed.
	      else if (selection == 2)
	      {
	    	  variable = abc.multiplication (operand1, operand2);
	    	  
	    	  output.println ("Answer is: " + variable);
	      }
	
	      //If selection will be 3 then division will be performed.
	      else if (selection == 3)
	      {
	    	  variable = abc.division (operand1, operand2);
	    	  
	    	  output.println ("Answer is: " + variable);
	      }
	
          testcase = testcase - 1;
      }
    
output.print ("ThankYou");
    
scan.close ();
  
}

}



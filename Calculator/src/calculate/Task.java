package calculate;

public class Task
{
  
  //This function contains logic of addition of two numbers.
  public int addition (int operand1, int operand2) 
  {  
	  int var;
	  
	  var = operand1 + operand2;
	  
	  return var;
  }
  
  //This function contains logic of multiplication of two numbers.
  public int multiplication (int operand1, int operand2) 
  {
	  int var;
	  
	  var = operand1 * operand2;
	  
	  return var;
  }
  
  //This function contains logic of division of two numbers.
  public int division (int operand1, int operand2) 
  {
	  if(operand2==0)
			throw new ArithmeticException("Cannot divide by zero");
		else
			return operand1/operand2;  
  }

}



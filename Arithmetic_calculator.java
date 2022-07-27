
import java.util.*;
final class Operation
{ 
	int z;
	int addition(double x,double y)
	{ 
		//Implicit type casting
		this.z=(int)x+(int)y;
		return z;
	}
public static class Subtraction{
	double z;
	Subtraction(double x,double y)
	{
		z=x-y;
	}
		double display()
		{
			return z;
		}
}
	 double multi(double x,double y)
	{
		double z;
		z= (x*y);
		return z;
	}
	double divi(double x,double y)
	{
		double z;
		z=x/y;
		return z;
	}
	double modulo(double x,double y)
	{
		double z;
		z=x%y;
		return z;
	}
	
}
public class Arithmetic_calculator
{
	public static void main(String[] args) {
	double a,b;
	char op;
	System.out.println("The operations that can be done in this calculator include:\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
    System.out.println("enter two numbers");
    Scanner s=new Scanner(System.in);
    a=s.nextDouble();
    b=s.nextDouble();
    System.out.println("Enter the symbol of operation to be performed");
    op=s.next().charAt(0);
    Operation obj=new Operation();
    if(op=='+')
    {
     System.out.println("The added value is"+" "+obj.addition(a, b)); 
    
    }
    else if(op=='-')
    {
    	Operation.Subtraction obj1=new Operation.Subtraction(a, b);
    	System.out.println("The subtracted output is:"+" "+obj1.display());
    }
    else if(op=='*') 
    {
    	System.out.println("The multiplied value is"+" "+obj.multi(a, b));
    } 
    else if(op=='/')
    {
    	if(a==0)
    	{
    		System.out.println("The quotient and the reaminder is zero");
    	}
    	else if(b==0)
    	{
    		System.out.println("Infinite");
    	}
    	else if(a==0 && b==0)
    	{
    		System.out.println("Infinite");
    	}
    	else
    	{
    		System.out.println("The quotient is:"+" "+obj.divi(a,b));
    		System.out.println("The remainder is:"+" "+obj.modulo(a, b));
    	}
    }
    
	}

}

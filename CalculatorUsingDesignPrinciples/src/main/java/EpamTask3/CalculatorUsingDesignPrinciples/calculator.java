package EpamTask3.CalculatorUsingDesignPrinciples;

import java.util.Scanner;

interface Calculate
{
	double calculate(double num1,double num2);
}
class Add implements Calculate
{
	public double calculate(double num1,double num2)
	{
		return(num1+num2);
	}
}
class Subtract implements Calculate
{
	public double calculate(double num1,double num2)
	{
		return(num1-num2);
	}
}
class multiply implements Calculate
{
	public double calculate(double num1,double num2)
	{
		return(num1*num2);
	}
}
class divide implements Calculate
{
	public double calculate(double num1,double num2)
	{
		return(num1/num2);
	}
}

public class calculator {

	public static void main(String[] args) {
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("||---------------------EPAM CALCULATOR TASK---------------------------------------||");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
		double num1,num2,Result;
		Scanner sc=new Scanner(System.in);
		
		Calculate add=new Add();
		Calculate sub=new Subtract();
		Calculate mul=new multiply();
		Calculate div=new divide();
		char Preference;
		do {
			System.out.println("\nEnter the First number:::");
			num1=sc.nextDouble();
			System.out.println("\nEnter the Second number:::");
			num2=sc.nextDouble();
			
		System.out.println("Enter the operation you want to perform(+,-,*,/");
		char operation=sc.next().charAt(0);
		switch(operation)
		{
		case '+':
			System.out.println("The Result of the addition operation is "+add.calculate(num1,num2));
			break;
		case '-':
			System.out.println("The Result of the subtraction operation is "+sub.calculate(num1,num2));
			break;
		case '*':
			System.out.println("The Result of the multiplication operation is "+mul.calculate(num1,num2));
			break;
		case '/':
			System.out.println("The Result of the division operation is "+div.calculate(num1,num2));
			break;
	    default:
	    	System.out.println("Enterred Wrong Operator!!! Enter From One of the Four Operators:");
		}
    	System.out.println("Calculation is always Fun!!Lets Do it Again::Press 'y' to cotinues::Else Press 'n'to exit");
    	sc.nextLine();
    	Preference=sc.next().charAt(0);
    
     	}while(Preference!='n');
		sc.close();
		
    	System.out.println("Thanks For Using Me!!! See You Soon");

	}

}

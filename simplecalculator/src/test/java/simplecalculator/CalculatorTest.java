package simplecalculator;
import java.util.Scanner;
public class CalculatorTest {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	CalcImpl ci=new CalcImpl();
	double r=0;
	//Enter the expression like: 10 + 2 with spaces between the elements
	System.out.println("Enter the Expression to be evaluated: ");
	String input= sc.nextLine();
	String []a = input.split(" ");
	switch(a[1].charAt(0))
	{
	case '+':
	r= ci.add(Double.parseDouble(a[0]),Double.parseDouble(a[2]));
	break;
	case '-':
	r= ci.sub(Double.parseDouble(a[0]),Double.parseDouble(a[2]));
	break;
	case '*':
	r= ci.multi(Double.parseDouble(a[0]),Double.parseDouble(a[2]));
	break;
	case '/':
	r= ci.div(Double.parseDouble(a[0]),Double.parseDouble(a[2]));
	break;
	}
	System.out.println(a[0]+" "+a[1]+" "+a[2]+"= "+r);
	sc.close();
	}
	
}

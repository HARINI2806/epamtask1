package simplecalculator;

public class CalcImpl implements Calc {
	double r=0;
	@Override
	public double add(double val1,double val2) {
		return (val1+val2);
	}
	@Override
	public double sub(double val1,double val2) {
		return (val1-val2);
	}
	@Override
	public double multi(double val1,double val2) {
		return (val1*val2);
	}
	@Override
	public double div (double val1, double val2) {
		try {
			r=val1/val2;
		}
		catch(ArithmeticException e) {
			System.out.println("Attempted divide by zero!");
		}
		return r;
	}
}

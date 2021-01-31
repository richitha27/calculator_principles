package epam_calculator.sampleCalculator;

public class Div extends Perform{
	

	public Div(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public void division(double a, double b) {
		// TODO Auto-generated method stub
		 if (b != 0) {
		        System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
		        
		    } else {
		        System.out.println("Division with 0 is not possible");
		       
		    }
	}

}

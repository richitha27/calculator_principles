package epam_calculator.sampleCalculator;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Simple Calculator");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double a;
		double b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        
        
        //Calculator cal = new Calculator(a,b);
        System.out.println("enter the required choice:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        int choice = sc.nextInt();
        switch(choice) {
        	
        case 1:  	Add cal =  new Add(a,b);
        			cal.addition(a, b);
        			break;
        case 2:  	Sub cal1 = new Sub(a,b);
        			cal1.subtraction(a, b);
        			break;
        case 3:  	Mul cal2 = new Mul(a,b);
        			cal2.multiplication(a, b);
        			break;
        case 4:  	Div cal3 = new Div(a,b);
        			cal3.division(a, b);
        			break;
        default: System.out.println("enter correct choice");
        }
        sc.close();
    }
}

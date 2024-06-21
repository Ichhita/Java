
package javaintro;
import java.lang.FunctionalInterface;
//lambda exp : unnamed method, used to implement a method defined by functional interface
// (parameter list) -> lambda body

@FunctionalInterface
interface myInterface
{
	double PiValue();
}
public class lambdaExp {
	public static void main(String args[])
	{
		myInterface ref;
		ref = () -> 3.1415;
		System.out.println("The value of Pi is: "+ref.PiValue());
	}
}

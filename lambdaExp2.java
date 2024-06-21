//Lambda expression with parameter
package javaintro;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface Interface
{
	String reverse(String a);
}

public class lambdaExp2 
{
	public static void main(String[] args) {
		Interface ref = (str) -> {
			String res ="";
			for (int i=str.length()-1; i>=0; i--)
				res = res+str.charAt(i);
				return res;
			};
			System.out.println("Reverse of Pie="+ref.reverse("Pie"));
	}
}
	


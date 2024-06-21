//Generic functional interface and lambda exp
package javaintro;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface genericInterface<T>
{
	//generic method
	T func(T t);
}
public class genLambda 
{
	public static void main(String[] args)
	{
		genericInterface<String> reverse = (str)->
		{
			String res ="";
			for(int i=str.length()-1; i>=0; i--)
				res += str.charAt(i);
			return res;
		};
		System.out.println("Reverse of Animal = "+reverse.func("Animal"));
		genericInterface<Integer> sum = (n)->
		{
			int s,a=5, b=10;
			s=a+b;
			return s;
			
		};
		System.out.println("Addition of 5 and 10 is "+sum.func(null));

	}
}

import java.util.*;
class Epsilon
{
	public static void main(String args[])
	{
		final double EPSILON = 1E-14;
		double r = Math.sqrt(2.0);
		System.out.println("Square Root: " + r );
		if(Math.abs(r*r - 2.0) < EPSILON)
		{
			System.out.println("Math.sqrt(2.0) squared is approximately 2.0");
		}
	}
}
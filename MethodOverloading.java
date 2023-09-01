//Writing more than one method with same name and different parameters within same class is called Method overloading
//Yes we can overload Main method. but paramteter list should be different but jvm will call main method  which accept string args[] as argument.

public class MethodOverloading
{
	public static void main(String[] args) {
		System.out.println("Its actual main method");
	}
	public static void main(int a)
	{
	    System.out.println("integer value is passed as parameter");
	}
	public static void main(double a)
	{
	    System.out.println("Double value is passed as paramter");
	}
}

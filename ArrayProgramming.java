import java.util.*;
public class ArrayProgramming
{
	public static void main(String[] args) {
		int []arr={10,20,30};
		display(arr);
		for(int i=0;i<arr.length;i++)
		{
		    System.out.println(arr[i]);
		}
	}
	public static void display(int[]brr)
	{
	    brr[0]=50;
	    for(int i=0;i<brr.length;i++)
	    {
	        System.out.println(brr[i]);
	    }
	}
}

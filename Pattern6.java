
//1
//12
//123
//1234



import java.util.*;
public class Pattern6
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<i+1;j++)
		    {
		        System.out.print(j+1);
		    }
		    System.out.println();
		}
	}
}
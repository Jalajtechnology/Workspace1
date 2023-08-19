//* * * * *
//*       *
//*       *
//*       *
//* * * * *
import java.util.*;
 class Pattern1
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==0 || i==n-1)
		        {
		            System.out.print("* ");
		        }
		        else 
		        {
		            if(j==0 || j==n-1)
		            {
		                System.out.print("* ");// This function after completing task keep cursor on same line.
		            }
		            else
		            {
		                System.out.print("  ");
		            }
		        }
		    }
		    System.out.println();//this function will move the cursor on new line after completing task
		}
	}
}

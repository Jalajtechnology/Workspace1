*      *
 *    *
  *  *
   **
   **
  *  *
 *    *
*      *







import java.util.*;
public class Pattern12
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if( j!=i && j==(n-1-i))
		        {
		            System.out.print("*");
		        }
		        else if(j==i)
		        {
		            System.out.print("*");
		        }
		        else
		        {
		            System.out.print(" ");
		        }
		    }
		    System.out.println(" ");
		}
		
		
	}
}
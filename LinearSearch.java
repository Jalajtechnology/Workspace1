public class LinearSearch
{
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		int k=20;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]==k)
		    {
		        System.out.print(arr[i] + "found at"+i);
		        
		        break;
		    }
		}
	}
}

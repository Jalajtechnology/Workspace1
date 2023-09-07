class Fan
{
    int cost;
}
public class objectarray
{
	public static void main(String[] args) {
		Fan  [] arr=new Fan[3];
		arr[0]=new Fan();
		arr[1]=new Fan();
		arr[2]=new Fan();
		arr[0].cost=1000000;
		arr[1].cost=9000000;
		arr[2].cost=9088888;
		for(int i=0;i<arr.length;i++)
		{
		    System.out.println(arr[i].cost);
		}
		
		
		
	}
}

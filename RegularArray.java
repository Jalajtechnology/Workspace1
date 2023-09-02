class RegularArray
{
public static void main(String[] args)
{
int [][]arr=new int [3][4];// 3 is no of rows 4 is no of colums
for(int i=0;i<3;i++)
{
for(int j=0;j<4;j++)
{
arr[i][j]=12;
}
}
System.out.println(arr[2][2]);

}
}
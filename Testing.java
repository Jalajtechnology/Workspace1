class Calculator
{
int result;
void add(int a,int b)
{
result=a+b;
System.out.println(result);
}
}
class Testing
{
public static void main(String args[])
{
Calculator c=new Calculator();
c.add(10,20);
}
}
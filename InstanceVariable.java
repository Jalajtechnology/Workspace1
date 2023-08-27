class InstanceVariable
{
int x=10;//Instance Variable
public static void main(String args[])
{
InstanceVariable s1=new InstanceVariable(); // for accessing instance variable object needs to be created.
s1.print();
}
public  void print()
{
System.out.println(x);
}
}

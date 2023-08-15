class Increament
{
public static void main (String args[])
{
byte a=10;
a++;
System.out.println(a);
a=a+1;//result in compile time error as int cannot be converted to byte.
System.out.println(a);
}
}
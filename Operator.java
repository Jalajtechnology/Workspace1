class Operator
{
public static void main(String args[])
{
int a=10;
int b;
int  c;
c=b=a;//chained assignment
System.out.println(a +" "+b+" "+c+"");
c=a+b;//arithmetic
System.out.println(c);
//Relational operator != > <= ==
if(a!=b)
{
System.out.println(" a is not equal to b");
}
else if(a>b)
{
System.out.println(" a  is greater than b");
}
else if(b>a)
{
System.out.println(" b is greater than a");
}
else
{
System.out.println("Both are equal");
}
if((a==b) && (c>a))// logical operators && || !
{
System.out.println(" a is equal to b and c is greater than a and b");

} 
 long l=Integer.MAX_VALUE+1;// jvm will take care of this no compile time error;
System.out.println(l);
byte j=(byte)138;
System.out.println(j);
byte a=10;
byte a=138;
}
}


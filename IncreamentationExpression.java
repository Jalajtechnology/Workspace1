class IncreamentationExpression
{
public static void main(String args[])
{
//int a=5;
//a++;
//System.out.println(a);
//int b=5;
//++b;
//System.out.println(b);
//int b=a++;
//System.out.println(a);
//System.out.println(b);
//int b=a++ + a++ + ++a;
//System.out.println(a);
//System.out.println(b);
//In expression a++ means first use then increament ; ++a means first increament then use.
//int b=a++ + --a - a-- - a++;
//System.out.println(b);
//byte b=10*10;
//System.out.println(b);
//int  a=5;
//int b=5;
//byte d=a*b;
//System.out.println(d);
//byte f=100*10;
//System.out.println(f); compile time error
//byte a=10;
//byte b=20;
//byte d=a*b  it will result in ce error 
//long a=100;
//long b=10000000000;
//long c=a*b;
//System.out.println(c); Ce error int value too large since it will goes out of int .
// to remove this error we can specify long literal with suffix l or L. .
long a=100;
long b=10000000000l;
long d=a*b;
System.out.println(d);

int k=(int)12.0f;
System.out.println(k);







}
}

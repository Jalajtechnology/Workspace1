class TypeConversion
{
public static void main(String args[])
{
//long a=9223377036854775l;
//System.out.println(a);
byte a=45;
double b;
b=a;
System.out.println(b);
int D=24;
float f=5.0f;
float c=D/f;
System.out.println(c);
int r=10;
//float w=2.5;
//int d=r*w;
//System.out.println(d);
//above result in compile time error;
byte ab=10;
byte cd=5;
byte d=(byte)(ab*cd);
System.out.println(d);
// int*int will give int and int cant be stored in byte it will give runtime error so we explicitly convert it.
long t=23*23;
System.out.println(t);
}
}
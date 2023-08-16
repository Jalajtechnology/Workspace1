class Switch
{
public static void main(String args[])
{
int number=99;
switch(number)
{
case 99:
System.out.println(" 100 found"); 
break;
// apply break as if any case matches it will execute other case body also thats why break is necessary.


case 12:
System.out.println(" Why coming here");
break;

default:
System.out.println("No value found");
break;
}
}
}
class ConditionalStatement
{
public static void main(String args[])
{
// Program for finding least among all three no.
int a=2;
int b=7;
int c=1;
if(a<b && a<c)
{
System.out.println(" a is smallest among all");
}
else if(b<a && b<c)
{
System.out.println(" b is smalles among all");
}
else if(c<a && c<b)
{
System.out.println(" c is smallest");
}
else if(a==b && b==c)
{
System.out.println("THree of them are equal u can take any one of them ");
}
// same logic u can use for finding largest among them just use > operator instead of <.
int e=10;
int f=5;
int g=(e>f)?e :f;// Ternary operator
System.out.println(g);


}
}
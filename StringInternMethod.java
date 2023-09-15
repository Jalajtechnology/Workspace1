import java.util.*;
public class StringInternMethod
{
	public static void main(String[] args) {
		String str=new String("jalaj");
		String str1=str.intern();
		String str2=str1;
		System.out.println(str1==str2);
	}
}

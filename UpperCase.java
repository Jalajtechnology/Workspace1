import java.lang.String;
public class UpperCase
{
	public static void main(String[] args) {
		String str1="jalajagarwal";
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
		    char ch=(char)(str1.charAt(i)-32);
		    str2=str2+ch;
		}
		System.out.println(str2);
		
		
	}
}

import java.lang.String;
public class ImmutableString
{
	public static void main(String[] args) {
		String s=new String("jalaj");
                String p=s.replace('j','a');
                System.out.println(s);
                System.out.println(p);

		
	}
}

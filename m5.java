import java.util.*;
public class m5
{
public static void main(String[] a)
{
char c1=(a[0]).charAt(0);

if((c1<='z'&&c1>='a')||(c1<='A'&&c1<='Z'))
System.out.println("Alphabet");
else if(c1<='9' && c1>='0')
System.out.println("Number");
else
System.out.println("Special Character");
}

}
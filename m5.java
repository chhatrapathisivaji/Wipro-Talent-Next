import java.util.*;
public class m5
{
public static void main(String[] a)
{
char c1=(a[0]).charAt(0);

if(Character.isLetter(c1))
System.out.println("Alphabet");
else if(Character.isDigit(c1))
System.out.println("Number");
else
System.out.println("Special Character");
}

}

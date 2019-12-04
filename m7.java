class m7
{
public static void main(String[] a)
{
char c1=a[0].charAt(0),c2=' ';
if(c1>='A' && c2<='Z')
c2=(a[0].toLowerCase()).charAt(0);
if(c1>='a' && c1<='z')
c2=(a[0].toUpperCase()).charAt(0);
System.out.println(c1+"->"+c2);
}
}
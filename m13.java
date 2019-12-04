class m13
{
public static void main(String[] a)
{

int n,count=0;
for(n=11;n<=99;n+=2)
{
count=0;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
count++;
}
if(count==0)
System.out.println(n+" is a Prime");
}
}
}
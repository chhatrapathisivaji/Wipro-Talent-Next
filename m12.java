class m12
{
public static void main(String[] a)
{
if(a.length==1)
{
int n=Integer.parseInt(a[0]),count=0;
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
count++;
}
if(count==0)
System.out.println("Prime");
else
System.out.println("Not a Prime");
}
else
System.out.println("Please Enter a number");

}
}
class m14
{
public static void main(String[] a)
{
if(a.length==1)
{
int n=Integer.parseInt(a[0]),count=0;
if(n==1||n==0)
{
System.out.println(n+" is neither prime nor composite");
}
else
{
for(int i=2;i<=n/2;i++)
{
if(n%i==0)
count++;
}
if(count==0)
System.out.println(n+" Is Prime");
else
System.out.println(n+" Is not a Prime");
}
}
else
System.out.println("Please enter an integer number");

}
}

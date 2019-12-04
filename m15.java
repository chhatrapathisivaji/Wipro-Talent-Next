class m15
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]),sum=0;
int num=n;
while(n>0)
{
sum+=n%10;
n/=10;
}
System.out.println(num+"->"+sum);
}
}
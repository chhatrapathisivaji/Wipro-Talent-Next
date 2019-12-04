import java.util.Scanner;
class m20
{
public static void main(String[] args)
{
Scanner Sc=new Scanner(System.in);
int n,a,b;char c;
boolean x=true;
while(x)
{
System.out.println("Give two numbers");
a=Sc.nextInt();b=Sc.nextInt();
System.out.println("1. Add");
System.out.println("2. Subtract");
n=Sc.nextInt();
if(n==1)
System.out.println("Addition of "+a+" and "+b+" :"+(a+b));
else if(n==2)
System.out.println("Subtraction of "+a+" and "+b+" :"+(a-b));
System.out.println("Wish to continue ::\n Y-YES \n N-NO");
c=(Sc.next()+Sc.nextLine()).charAt(0);
if(c=='y'||c=='Y')
x=true;
else 
x=false;
}
}

}
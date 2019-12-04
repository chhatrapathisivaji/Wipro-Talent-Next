import java.util.*;
class m6
{
public static void main(String a[])
{
String gender=a[0];
String s1="Male",s2="male",s3="Female",s4="female";
int age=Integer.parseInt(a[1]);
float interest=0;
if(gender.equals(s1)||gender.equals(s2))
{
if(age>=1 && age<=60)
interest=9.2f;
else if(age<=120 && age>=61)
interest=8.3f;
}
else if(gender.equals(s3)||gender.equals(s4));
{
if(age>=1 && age<=58)
interest=8.2f;
else if(age<=120 && age>=59)
interest=7.6f;
}
System.out.println("Gender : "+gender+"  Age :"+age+" Interest : "+interest);
}
}








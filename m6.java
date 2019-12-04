import java.util.*;
class m6
{
public static void main(String a[])
{
String gender=a[0];
int age=Integer.parseInt(a[1]);
float interest=0;
if(gender=="Male")
{
if(age>=1 && age<=60)
interest=9.2f;
else if(age<=120 && age>=61)
interest=8.3f;
}
elseimport java.util.*;
class m6
{
public static void main(String a[])
{
String gender=a[0];
int age=Integer.parseInt(a[1]);
float interest=0;
if(gender=="Male")
{
if(age>=1 && age<=60)
interest=9.2f;
else if(age<=120 && age>=61)
interest=8.3f;
}
else if(gender.equals("Female"));
{
if(age>=1 && age<=58)
interest=8.2f;
else if(age<=120 && age>=59)
interest=7.6f;
}
System.out.println("Gender : "+gender+"  Age :"+age+" Interest : "+interest);
}
}

{
if(age>=1 && age<=58)
interest=8.2f;
else if(age<=120 && age>=59)
interest=7.6f;
}
System.out.println("Gender : "+gender+"  Age :"+age+" Interest : "+interest);
}
}

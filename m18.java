import java.util.Scanner;
class m18
{
public static void main(String args[])  
   {  
      String original, reverse = ""; 
      Scanner in = new Scanner(S:?
ystem.in);     
      original = in.nextLine();   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}
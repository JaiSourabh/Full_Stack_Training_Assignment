import java.util.Scanner;

class Task4
{
   public static void main(String[] args)
   {
      int i, count, j, k, repChars=0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      String str = s.nextLine();
      
      str = str.replaceAll("\\s+", "");
      str = str.toLowerCase();
      int strLen = str.length();
      char[] arr = new char[strLen];
      
      for(i=0; i<strLen; i++)
         arr[i] = str.charAt(i);
      
      for(i=0; i<strLen; i++)
      {
         count = 0;
         for(j=(i+1); j<strLen; j++)
         {
            if(arr[i]==arr[j])
            {
               count++;
               for(k=j; k<(strLen-1); k++)
                  arr[k] = arr[k+1];
               strLen--;
               j--;
            }
         }
         if(count>0)
            repChars++;
      }
      
         System.out.println("\nThere are " +repChars+ " characters found in the String.");
   }
}



# ReverseInt
import java.io.*;
import java.util.*;
pulic class ReverseInt
{
  public static void main(String args[])
  {
   int num=0;
      int reversenum =0;
      System.out.println("Input your number and press enter: ");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
      while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }

      System.out.println("Reverse of input number is: "+reversenum);
   }
}

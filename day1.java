/*Janmansh has to submit 3 assignments for Chingari before 10 pm and he starts to do the assignments at X pm. Each assignment takes 1 hour to complete.
Can you tell whether he'll be able to complete all assignments on time or not?*/



/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner ts=new Scanner(System.in);
      int t=ts.nextInt();
      while(t-->0){
          int x=ts.nextInt();
          int y=x+3;
          if(y<=10){
              System.out.print("YES");
          }
          else{
              System.out.print("NO");
          }
      }
	}
}

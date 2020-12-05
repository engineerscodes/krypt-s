/**
 * 
 */
package Traditional_Ciphers.Substitution_Ciphers;

import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class FeistelCipher
{

     static  List<Integer> left = new ArrayList<>();
     static   List<Integer> right = new ArrayList<>();
     static List<Integer> temp = new ArrayList<>();
     static  long KEY;
	
	public static void main(String[] args) 
	{  Scanner in = new Scanner(System.in);
		KEY = 11111111;
        System.out.println(KEY);

        String str = in.nextLine();

        if (str.length() % 2 != 0)
            str += " ";

        System.out.println("Entered Text: "+ str);

        int mid = str.length() / 2;
        for (int i = 0; i < mid; i++)
            left.add((int) str.charAt(i));
       
        System.out.println(left);
        for (int i = mid; i < str.length(); i++)
            right.add((int) str.charAt(i));

        System.out.println(right);
        encrypt();
	}
  public static  void  encrypt()
  {
      for (int r = 1; r <= 3; r++) 
      {
          for (int i = 0; i < right.size(); i++) 
          {
              left.set(i, left.get(i) ^ (function(right.get(i), KEY, r)));
          }
          temp = left;
          left = right;
          right = temp;
      }
      String EnMSG="";
      
    
       for(Object x:right)
       {
    	   EnMSG+=x.toString();
       }
       String Leftlength=EnMSG.length()+"";
       for(Object x:left)
       {
    	   EnMSG+=x.toString();
       }
       String Rigthlength=EnMSG.length()+"";
       EnMSG+=(char)Integer.parseInt(Leftlength)+"";
      System.out.println("-------------------->"+EnMSG);
      System.out.println("-------------------->"+Leftlength);
      System.out.println("-------------------->"+Rigthlength);

  ///decrypt(right,left,temp,KEY);
      decrypt(EnMSG);
  }
  
  public static int function(int cur, long key, int roundNumber)
  {

      return (int) 2 * (int) key ;
  }
  
  public static void decrypt(String EnMSG)
  {     String a[]=EnMSG.split("");
	    int Leftlength=Integer.parseInt(a[a.length-1].toString());
	  
	  System.out.println(Leftlength);
      for (int r = 3; r >= 1; r--) 
      {
          temp = left;
          left = right;
          right = temp;
          for (int i = 0; i < right.size(); i++)
          {
              left.set(i, left.get(i) ^ (function(right.get(i), KEY, r)));
          }
      }

      for (int i : left) 
          System.out.print((char) i);

      for (int i : right) 
          System.out.print((char) i);
  }
  
  
}


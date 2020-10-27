/**
 * 
 */
package Maths;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Gcd 
{
    int gcd;
	public Gcd()   //gcd of (a,b)=gcd(b,a)
	{
     
	}
   public int calGcd(int n1,int n2)
   {  int r1=n1,r2=n2,r=0,q=0;
	   while(r2>0)
	   {
		   q=r1/r2;
		   r=r1-q*r2;
		   r1=r2;
		   r2=r;
	   }
	   System.out.println("GCD 0F"+"("+n1+","+n2+")"+"is : "+r1);
	   return r1;
   }
}


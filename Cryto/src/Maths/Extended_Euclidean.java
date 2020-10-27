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
public class Extended_Euclidean
{
    long s,t;

	public Extended_Euclidean()
	{

	}
	
	public void calextended(long n1,long n2)
	{
		long r1=n1,r2=n2,r=0,s=0,s1=1,s2=0,t1=0,t2=1,q=0;
		while(r2>0)
		{
		   q=r1/r2;
		   r=r1-q*r2;
		   r1=r2;
		   r2=r;
		   s=s1-q*s2;
		   s1=s2;
		   s2=s;
		   t=t1-q*t2;
		   t1=t2;
		   t2=t;
		}
		System.out.println("S :"+s1+" T :"+t1);
	}
	public long getS() 
	{
		return s;
	}

	public long getT()
	{
		return t;
	}
}


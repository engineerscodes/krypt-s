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
public class Multiplicative_ciphers 
{
     Map <Character,Integer>map=new HashMap();
     int key;
     String output="";
	public Multiplicative_ciphers() 
	{
		Additve_Cipher ac=new Additve_Cipher();
		this.map=ac.map;
	}
	
	public String encryption(String input,int key)
	{
		this.key=key;
		char ch[]=input.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(map.containsKey(ch[i]))
			{	int temp=map.get(ch[i]);
			//System.out.println(temp+" "+key);
			    int sum=((temp*key)%26)+65;
			   output+=((char)sum);    
			}
		}
		System.out.println(output);
		return output;
	}
  public static void main(String ...strings)
  {
	  new  Multiplicative_ciphers().encryption("HELLO",7);
  }
  
}


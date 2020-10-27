/**
 * 
 */
package ALGO;
import java.util.*;
import Maths.GetSetsElement;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Additve_Inverse 
{
	public Additve_Inverse() 
	{

	}
  public Map inverse(int n)
  {    Map map=new HashMap();
	  Set s=new GetSetsElement().GetElement(n);
	  for(Object i:s)
		 for(Object j:s)
		 {
			 if((Integer.parseInt(i.toString())+Integer.parseInt(j.toString()))%n==0)
			 {
				if(map.containsKey(j)||map.containsValue(i))
				{}
				else
					map.put(i,j);
			 }
		 }
	  System.out.println(map);
	  return map;
  }
  public static void main(String ...strings)
  {
	  new  Additve_Inverse().inverse(10);
  }
}


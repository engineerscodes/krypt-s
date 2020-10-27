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
public class GetSetsElement 
{

	public Set  GetElement(int n) 
	{   Set s=new LinkedHashSet(n);
		for(int i=0;i<n;i++)
			s.add(i);
		//System.out.println(s);
		return s;
	}
	
}


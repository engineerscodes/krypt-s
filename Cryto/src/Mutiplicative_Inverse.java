import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Maths.GetSetsElement;
import Maths.Extended_Euclidean;
import Maths.Gcd;
/**
 * 
 */

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class Mutiplicative_Inverse {

public static void main(String ...strings)
{
	new  Mutiplicative_Inverse ().inverse(11);
}

public Map inverse(int n)
{  Map map=new HashMap();
      ArrayList  list = new ArrayList();
    Set s=new GetSetsElement().GetElement(n);
for(Object i:s)
{
	if(new Gcd().calGcd(Long.parseLong(i.toString()),n)==1)
	{
		list.add(i);
	}
}
for(Object i:list)
{
	for(Object j:list)
	{
		if((Integer.parseInt(i.toString())*Integer.parseInt(j.toString()))%n==1)
		{
			if(map.containsKey(j)||map.containsValue(i))
			{}
			else
				map.put(i,j);
		}
	}
}
System.out.println(map);
	return map;
}

}


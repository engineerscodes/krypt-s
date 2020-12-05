/**
 * 
 */
package learn;

import java.io.UnsupportedEncodingException;

/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class basic001 
{

	public static void main(String ...strings)
	{
		String ch="c";
		try {
			System.out.println(new String(ch).getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


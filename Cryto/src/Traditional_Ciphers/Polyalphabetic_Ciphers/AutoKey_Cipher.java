/**
 * 
 */
package Traditional_Ciphers.Polyalphabetic_Ciphers;
import java.util.*;
/**
 *  @author M.NAVEEN
 *  RANDOM CODER'S
 *  Tech/Project Lead Android Club
 */
public class AutoKey_Cipher 
{
    Map<Character,Integer> map;
    int key;
    int keystream[];
	public AutoKey_Cipher()
	{
           map=new LinkedHashMap<Character, Integer>(); 
	}
	public String  insert(String s,int key)
	{
		char c[]=s.toUpperCase().toCharArray();
		System.out.println(Arrays.toString(c));
		for(int i=0;i<c.length;i++)
			map.put(c[i], (int)c[i]-65);
		System.out.print(map);
		return encode(c,key);
	}
	
	public String encode(char ch[],int key )
	{
		keystream=new int[ch.length];
		keystream[0]=key;
		for(int i=1;i<ch.length;i++)
		{
			keystream[i]=map.get(ch[i-1]);
		}
		//System.out.println(Arrays.toString(keystream));
		//System.out.println(keyStream);
		String output="";
		for(int i=0;i<keystream.length;i++)
		{  
			output+=(char)(((keystream[i]+map.get(ch[i]))%26)+65);
		}
		//System.out.println("\nENCODED MESSAGE===>"+output);
		return output;
	}
	
	public String decode(String cipher,int key)
	{   String decode="";
		char ch[]=cipher.toUpperCase().toCharArray();
		for(int i=0;i<ch.length;i++)
		{    System.out.println((int)(ch[i])+"---"+keystream[i]);
			decode+=(char)((((int)(ch[i])+65-keystream[i])%26)+65);
		}
		System.out.println(" "+decode);
		return decode;
	}
	public static void main(String ...strings)
	{
		AutoKey_Cipher ac=	new AutoKey_Cipher();
        String output=ac.insert("attack",12);
        System.out.println("\nENCODED MESSAGE===>"+output);
        ac.decode(output, 12);
        
	}
}


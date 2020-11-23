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
public class Playfair_Cipher
{   static Scanner nav=new Scanner(System.in);
    public char array[][]=new char[5][5]; 
    public char key[];
    public Object val_key[];
    ArrayList <Character>n =new ArrayList();
	public Playfair_Cipher(String s) 
	{
		key=s.toCharArray();
	}
    
	public void matrixcal()
	{  
		for(int i=0;i<5;i++)
			{for(int j=0;j<5;j++)
				System.out.print(" "+array[i][j]);
			System.out.println();
			}
	}
	public static void main(String[] args)
	{
       System.out.println("Enter the String Key (A-Z)");
       String key=nav.next();
       Playfair_Cipher pc=new Playfair_Cipher(key);
       pc.validate();
       pc.matrixcal();
		
	}

	private void validate()
	{   
		for(int i=0;i<key.length;i++)
		{
			if(!n.contains(key[i]))
			    n.add(key[i]);
		}
		val_key=n.toArray();
	}


}


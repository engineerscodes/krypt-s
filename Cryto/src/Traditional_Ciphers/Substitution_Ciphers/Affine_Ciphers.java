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
public class Affine_Ciphers 
{
    public String encryption(String input ,int key,int key2)
    {
    	Multiplicative_ciphers ac=new Multiplicative_ciphers ();
    	String cpt1=ac.encryption(input, key2);
    	Additve_Cipher mc=new Additve_Cipher();
    	String output=mc.encryption(cpt1, key);
    	System.out.println(output);
    	decode(output,key,key2);
    	return output;
    }
    public String decode(String input,int key,int key2)
    {
    	Additve_Cipher ac=new Additve_Cipher();
    	String cpt1=ac.decryption(input, key);
    	//System.out.println("addtive decode ="+cpt1);
    	Multiplicative_ciphers mc=new Multiplicative_ciphers();
    	 String output=mc.getkeyInverse(cpt1, key2);
    	//String output=mc.decryption2(cpt1, key2);
    	System.out.println(" Final decode ="+output);
    	return "";
    }
	public static void main(String[] args) 
	{
		String x=new Affine_Ciphers().encryption("HELLO",2, 7);
		System.out.println("\nTHE ENGRYPTED IS:"+x);
	}

}


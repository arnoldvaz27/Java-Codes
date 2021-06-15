import javax.crypto.*;
import java.util.*;

public class Blowfish1
{
	public static void main(String args[]) throws Exception
	{
		SecretKey key = KeyGenerator.getInstance("BlowFish").generateKey();
		Cipher cip = Cipher.getInstance("BlowFish");
		cip.init(Cipher.ENCRYPT_MODE,key);
		Scanner s = new Scanner(System.in);
		String pt = s.next();
//		String dt = s.next();
		byte[] encrypted = cip.doFinal(pt.getBytes());
//		byte[] encrypt = cip.doFinal(dt.getBytes());
		cip.init(Cipher.DECRYPT_MODE,key);
		byte[] ct = cip.doFinal(encrypted);
//		byte[] mt = cip.doFinal(encrypt);
		System.out.println(new String(encrypted));
//		System.out.println(new String(encrypt));
		String k = new String(ct);
//		String l = new String(mt);
		System.out.println(new String(ct));
//		System.out.println(l);
		if (pt.equals(k))
		{
			System.out.println("Password correct");
		}
		else
		{
			System.out.println("Password not correct");
		}
	}
}

// +" "+new String(ct)



/*
digitalmarketer :-

email:- arv483875@gmail.com
temperory password: - WURYQKZQAAVM
new password:- Hj23Gi78TYmbk


*/

/*
coursera
email:- arv483875@gmail.com
password:- 453CsweUBH24
package in.sameerit;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		String str = "abc@123";
		
		/**
		Encoder encoder = Base64.getEncoder();
		String encodedStr = encoder.encodeToString(str.getBytes());
		System.out.println(encodedStr);
		
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedStr);
		System.out.println(new String(decode));
		**/
		
		MessageDigest myDigest = MessageDigest.getInstance("SHA-256");
		myDigest.reset();
		myDigest.update(str.getBytes());
		byte[] encryptedTxt = myDigest.digest();
		System.out.println(new String (encryptedTxt));
		String encoded = Base64.getEncoder().encodeToString(encryptedTxt);
		System.out.println(encoded);
		
	}

}

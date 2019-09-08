package dec;

import java.util.*;
import javax.xml.bind.DatatypeConverter;
public class Decryption {
	 
    Decryption(String key) throws Exception 
    { 
        String encode
            = "4D546B794C6A45324F4334774C6A4E7A5A4764325A484D3D"; 
  
        byte[] enc = DatatypeConverter.parseHexBinary(encode);
        String encoded = new String(enc);
        
  
        // decode into String from encoded format 
        byte[] actualByte = Base64.getDecoder() 
                                .decode(encoded); 
  
        String actualString = new String(actualByte); 
  
       
        String[] l= new String[2];
        int i=actualString.length();
          l[0]=(actualString.substring(i- actualString.length(), Math.min(i - 6, actualString.length())));
          l[1]=(actualString.substring(i-6, Math.min(i, actualString.length())));

          String ip = l[0];
       //   String key = l[1];

          System.out.println(ip+"\n"+key+"\n");
    }
}

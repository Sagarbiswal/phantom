package dec;
import java.net.InetAddress;
import java.io.UnsupportedEncodingException;
import java.util.*; 
import java.util.Random;
import javax.xml.bind.DatatypeConverter;

public class Encryption {
    String hexValue;
    
     Encryption( String key) throws Exception {  
        Random rand = new Random();
        InetAddress IP = InetAddress. getLocalHost();
        String ip = IP. getHostAddress();
        String total=ip + key  ;
      //  System.out.println("Sample String: "+ total); 
  
        // Encode into Base64 format 
        String BasicBase64format 
            = Base64.getEncoder() 
                  .encodeToString(total.getBytes()); 
  
     //   System.out.println("Encoded String: " + BasicBase64format); 
        
        hexValue = toHexadecimal(BasicBase64format);
            
    }


   
   
    
    public static String toHexadecimal(String text) throws UnsupportedEncodingException
    {
        byte[] myBytes = text.getBytes("UTF-8");
        return DatatypeConverter.printHexBinary(text.getBytes());
    }
}
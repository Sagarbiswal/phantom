/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phantom;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.UnsupportedEncodingException;
import java.util.*;
import javax.xml.bind.DatatypeConverter;
public class decn {
    String ip;
    String key;
    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();
    decn()
    {
        
    }
    String getRHex(){
      InetAddress ip;
        String RHex;
        try {
            
            RHex = HexStringConverter.getHexStringConverterInstance().stringToHex(""+InetAddress.getLocalHost());
            
 
        } catch (UnknownHostException e) {
 
           return "ERROR";
        }
    return  RHex;
    
    }
    String getRIp(String hex)
    {
        
        
        return  HexStringConverter.getHexStringConverterInstance().hexToString(hex);
    }
    String getSHex(String key)
    {
         

        return HexStringConverter.getHexStringConverterInstance().stringToHex(key);
    }
    int getSKey(String hex)
    {
        return Integer.parseInt(HexStringConverter.getHexStringConverterInstance().hexToString(hex));
    }
    
}



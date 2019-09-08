package Phantom;
import java.io.*;
import java.nio.file.Files;
public class EncDec{
	public int n=0;
	String loc;
	public String txtEnc(String s,int k) throws IOException{
		File f=new File (s);
		byte con[]=Files.readAllBytes(f.toPath());
		byte [] s1=modifyfile(k,con);
		String exten[]=s.split("\\.");
		String loc="C:\\Users\\lenovo\\Desktop\\java\\securefileTrans\\cipherfile."+exten[1];
		System.out.println("."+exten[1]+ " -file is created");
		saveFile(s1,loc);   //for conf
		return loc;
	}
	public String  txtDec(String s,int k) throws IOException {
		File f=new File (s);
		byte con[]=Files.readAllBytes(f.toPath());
		byte [] s1=modifyfile(-k,con);
		String exten[]=s.split("\\.");
		//	System.out.println(exten.length);
		String loc=System.getProperty("user.dir")+exten[1];
		//System.out.println("."+exten[1]+ " -file is created");
		saveFile(s1,loc);   //for confer
		return loc ;
	}



	public byte [] modifyfile(int k,byte con2[]) throws IOException  {
		byte destfile[]=new byte[con2.length];
		//destfile=null;
		int i;
		//System.out.println("lenth of byte array is:"+con2.length);
		for(i=0;i<con2.length;i++) {
			destfile[i]=(byte)((int)con2[i]+(k));
			//System.out.println(con2[i]);
		}

		return destfile;          
	}

	public static void saveFile(byte[] bytes,String s) throws IOException {

		FileOutputStream fos = new FileOutputStream(s);
		fos.write(bytes);
		fos.close();
	}
}

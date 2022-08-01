import java.io.*;
import java.io.FileOutputStream;

public class BUfferedOutputStreamExample {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
FileOutputStream fout=new FileOutputStream("E:\\testout.txt");
BufferedOutputStream bout=new BufferedOutputStream(fout);
String s = "java is robust and platform independence";
byte b[]=s.getBytes();
bout.write(b);
bout.flush();
bout.close();
fout.close();
System.out.println("succcessssss");
	}

}

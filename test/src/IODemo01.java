import java.io.*;
public class IODemo01{
	public static void main(String arg[]) throws Exception{
		File f= new File("d:\\demo.abc");
		RandomAccessFile raf1=null;
		raf1=new RandomAccessFile(f,"rw");	
		String name="";
		int score=0;
		byte b[]=null;
		/*b=new byte[4];
		for(int i=0;i<4;i++){
			b[i]=raf1.readByte();
		}
		name=new String(b);
		score=raf1.readInt();
		System.out.println("====¡·¡·"+name+"====>"+score);*/
		
		raf1.skipBytes(16);
		raf1.seek(0);
		b=new byte[4];
		for(int i=0;i<4;i++){
			b[i]=raf1.readByte();
		}
		name=new String(b);
		score=raf1.readInt();
		System.out.println("====¡·¡·"+name+"====>"+score);
		raf1.close();
	}
}

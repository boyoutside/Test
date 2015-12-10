import java.io.*;

public class IODemo02 {
	public static void main(String arg[]) throws Exception {
		File f = new File("d:\\demo02");
		InputStream input = null;
		input = new FileInputStream(f);
		byte b[] = new byte[1024];
		int count = 0;
		count = input.read(b);
		input.close();
		System.out.println(new String(b, 0, count));
	}
}

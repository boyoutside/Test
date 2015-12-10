package test;

import java.io.*;

public class IODemo03 {
	public static void main(String arg[]) throws Exception {
		File f = new File("d:\\writer");
		Reader r = null;
		r = new FileReader(f);
		char c[] = new char[1024];
		int count = 0;
		count = r.read(c);
		r.close();
		System.out.println(new String(c, 0, count));
	}
}

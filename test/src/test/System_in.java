package test;

import java.io.*;

public class System_in {
	public static void main(String args[]) {
		InputStream input = System.in;
		String str = "";
		int t = 0;
		try {
			while ((t = input.read()) != -1) {
				str = str + (char) t;
			}
			input.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		System.out.println("输入为:" + str);
	}
}
// InputStream input=System.in;
// 要从键盘开始输入
// byte b[]=new byte[1024];
// int count=0;
// try {
// count=input.read(b);
// input.close();
// } catch (IOException e) {
// // TODO 自动生成的 catch 块
// e.printStackTrace();
// }
// System.out.println(new String(b,0,count));

// System.out.println("请输入字符串：");
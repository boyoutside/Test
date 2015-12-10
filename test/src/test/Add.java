package test;

import java.io.*;

public class Add {
	public static void main(String atgs[]){
		BufferedReader buf=null;
		buf=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		int i=0;
		int j=0;
		System.out.println("请输入第一个整数：");
		try {
			str=buf.readLine();
			i=Integer.parseInt(str);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("请输入第二个整数：");
		try {
			str=buf.readLine();
			j=Integer.parseInt(str);
			buf.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("这两个数的和为："+(i+j));
	}
}

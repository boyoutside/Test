package test;

import java.io.*;

public class Bufered {
	public static void main(String args[]){
		BufferedReader buf=null;
		buf=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		System.out.println("请输入内容：");
		try {
			str=buf.readLine();
			buf.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("输入的内容为："+str);
	}
}

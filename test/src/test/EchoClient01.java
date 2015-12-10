package test;

import java.io.*;
import java.net.*;

public class EchoClient01 {
	public static void main(String args[]){
		Socket client=null;
		BufferedReader buf=null;
		PrintStream out=null;
		// 创建Socket
		// 打开Socket连接
		try {
			client=new Socket("localhost",9999);
			buf=new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println("1"+buf.readLine());//服务器输出
			System.out.println(buf.readLine());
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//键盘输入
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		// 进行读/写操作
		try {
			out=new PrintStream(client.getOutputStream());
			String userInput=null;
			while((userInput=in.readLine())!=null){
				out.println(userInput);
				System.out.println(buf.readLine());
			}
			// 关闭连接
//			in.close();
//			out.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		out.close();
	}
}

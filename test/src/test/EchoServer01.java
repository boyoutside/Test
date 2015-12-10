package test;

import java.io.*;
import java.net.*;

public class EchoServer01 {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		//创建Socket
		ServerSocket server=null;
		PrintStream out=null;//输出打印流
		BufferedReader buf=null;//服务器接收输入
		Socket client=null;
		try {
			server=new ServerSocket(9999);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//打开Socket连接
		while(true){
			try {
				client=server.accept();//准备好向客户输入
				out=new PrintStream(client.getOutputStream());//准备好 打印输出
				//接受信息
				buf=new BufferedReader(new InputStreamReader(client.getInputStream()));
				out.println("漳州职业技术学院欢迎您！！！"+"s");
				out.println("进入主题!!");
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			//进行读/写操作
			while(true){
				try {
					String str=buf.readLine();
					if(str==null){
						break;
					}else{
						if("bye".equals(str)){
							out.println("已经与主机断开连接~~~");
							break;
						}
						out.println("Echo:"+str);
					}
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			//关闭连接
			try {
				//关闭连接
				client.close();
				out.close();
//				server.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
//			out.close();
		}
	}
}

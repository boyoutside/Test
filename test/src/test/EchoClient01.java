package test;

import java.io.*;
import java.net.*;

public class EchoClient01 {
	public static void main(String args[]){
		Socket client=null;
		BufferedReader buf=null;
		PrintStream out=null;
		// ����Socket
		// ��Socket����
		try {
			client=new Socket("localhost",9999);
			buf=new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println("1"+buf.readLine());//���������
			System.out.println(buf.readLine());
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//��������
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		// ���ж�/д����
		try {
			out=new PrintStream(client.getOutputStream());
			String userInput=null;
			while((userInput=in.readLine())!=null){
				out.println(userInput);
				System.out.println(buf.readLine());
			}
			// �ر�����
//			in.close();
//			out.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		out.close();
	}
}

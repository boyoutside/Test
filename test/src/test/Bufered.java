package test;

import java.io.*;

public class Bufered {
	public static void main(String args[]){
		BufferedReader buf=null;
		buf=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		System.out.println("���������ݣ�");
		try {
			str=buf.readLine();
			buf.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("���������Ϊ��"+str);
	}
}

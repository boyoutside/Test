package test;

import java.io.*;

public class Add {
	public static void main(String atgs[]){
		BufferedReader buf=null;
		buf=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		int i=0;
		int j=0;
		System.out.println("�������һ��������");
		try {
			str=buf.readLine();
			i=Integer.parseInt(str);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("������ڶ���������");
		try {
			str=buf.readLine();
			j=Integer.parseInt(str);
			buf.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("���������ĺ�Ϊ��"+(i+j));
	}
}

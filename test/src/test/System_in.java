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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

		System.out.println("����Ϊ:" + str);
	}
}
// InputStream input=System.in;
// Ҫ�Ӽ��̿�ʼ����
// byte b[]=new byte[1024];
// int count=0;
// try {
// count=input.read(b);
// input.close();
// } catch (IOException e) {
// // TODO �Զ����ɵ� catch ��
// e.printStackTrace();
// }
// System.out.println(new String(b,0,count));

// System.out.println("�������ַ�����");
package test;

import java.io.*;

public class Copy {
	public static void main(String[] args){
		if(args.length!=2){
			System.out.println("����Ĳ����������ԣ������˳���");
			System.out.println("���磺Դ�ļ�·��	Ŀ���ļ�·��");
			System.exit(1);
		}
		File f1=new File(args[0]);
		File f2=new File(args[1]);
		InputStream input=null;
		OutputStream out=null;
		try {
			input=new FileInputStream(f1);
			out=new FileOutputStream(f2);
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		try {
			int i=0;
			while((i=input.read())!=-1){
				out.write(i);
			}
			System.out.println("������ɣ�");
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			System.out.println("����ʧ�ܣ�");
		}
		try {
			input.close();
			out.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}

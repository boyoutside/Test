package test;
import java.io.*;

public class Xc {

	public static void main(String[] args) throws Exception{
		int a1,a2;
		String c1,c2;
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������һ�����֣�");
		c1=buf.readLine();
		a1=Integer.parseInt(c1);
		System.out.println("������ڶ������֣�");
		c2=buf.readLine();
		a2=Integer.parseInt(c2);
		System.out.println(a1+"*"+a2+"="+(a1*a2));
	}
}

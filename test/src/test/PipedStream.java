package test;

import java.io.*;

class Send implements Runnable{
	private PipedOutputStream out=null;
	public Send(){
		this.out=new PipedOutputStream();	
	}
	public void run(){
		String str="abcd";
		try {
			this.out.write(str.getBytes());
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public PipedOutputStream getOut() {
		return this.out;
	}
} 
class Receive implements Runnable{
	private PipedInputStream input=null;
	public Receive(){
		this.input=new PipedInputStream();
	}
	public void run(){
		int count=0;
		byte b[]=new byte[1024];
		try {
			count=this.input.read(b);
			this.input.close();
			System.out.println(new String(b,0,count));
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public PipedInputStream getInput() {
		return this.input;
	}
}
public class PipedStream {
	public static void main(String args[]){
		Send s=new Send();
		Receive r=new Receive();
//		Ҫ��������ӵ�������ȥ
		try {
			s.getOut().connect(r.getInput());
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		new Thread(s).start();
		new Thread(r).start();
	}
}

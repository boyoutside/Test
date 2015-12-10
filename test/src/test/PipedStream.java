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
			// TODO 自动生成的 catch 块
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
			// TODO 自动生成的 catch 块
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
//		要把输出连接到输入上去
		try {
			s.getOut().connect(r.getInput());
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		new Thread(s).start();
		new Thread(r).start();
	}
}

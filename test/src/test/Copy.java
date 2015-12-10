package test;

import java.io.*;

public class Copy {
	public static void main(String[] args){
		if(args.length!=2){
			System.out.println("输入的参数个数不对，程序退出！");
			System.out.println("例如：源文件路径	目标文件路径");
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		try {
			int i=0;
			while((i=input.read())!=-1){
				out.write(i);
			}
			System.out.println("拷贝完成！");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("拷贝失败！");
		}
		try {
			input.close();
			out.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}

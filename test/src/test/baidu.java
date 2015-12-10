package test;

public class baidu {
static boolean zhangsan;
static boolean lisi=true;
public static void main(String[] args){
	System.out.println("张三："+zhangsan);
	System.out.println("李四："+lisi);
	if(zhangsan){
		System.out.println("张三有时间");
	}
	if(lisi){
		System.out.println("李四有时间");
	}
	} 
}
//InputStream input=System.in;
//要从键盘开始输入
//byte b[]=new byte[1024];
//int count=0;
//try {
//	count=input.read(b);
//	input.close();
//} catch (IOException e) {
//	// TODO 自动生成的 catch 块
//	e.printStackTrace();
//}
//System.out.println(new String(b,0,count));

//System.out.println("请输入字符串：");
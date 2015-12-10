package test;

import java.io.*;
import java.net.*;

public class EchoServer01 {
	@SuppressWarnings("resource")
	public static void main(String args[]){
		//����Socket
		ServerSocket server=null;
		PrintStream out=null;//�����ӡ��
		BufferedReader buf=null;//��������������
		Socket client=null;
		try {
			server=new ServerSocket(9999);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//��Socket����
		while(true){
			try {
				client=server.accept();//׼������ͻ�����
				out=new PrintStream(client.getOutputStream());//׼���� ��ӡ���
				//������Ϣ
				buf=new BufferedReader(new InputStreamReader(client.getInputStream()));
				out.println("����ְҵ����ѧԺ��ӭ��������"+"s");
				out.println("��������!!");
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			//���ж�/д����
			while(true){
				try {
					String str=buf.readLine();
					if(str==null){
						break;
					}else{
						if("bye".equals(str)){
							out.println("�Ѿ��������Ͽ�����~~~");
							break;
						}
						out.println("Echo:"+str);
					}
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
			//�ر�����
			try {
				//�ر�����
				client.close();
				out.close();
//				server.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
//			out.close();
		}
	}
}

package test;

import java.io.*;
import java.util.*;

interface Fruit{    
    public void grow();    
    public void eat();    
}    
class Apple implements Fruit{    
    public void grow(){    
            System.out.println("ƻ��������...");    
    }    
    public void eat(){    
            System.out.println("��ƻ��...");    
    }    
}    
class Orange implements Fruit{    
    public void grow(){    
            System.out.println("����������...");    
    }    
    public void eat(){    
            System.out.println("������...");    
    }    
}    
class Banana implements Fruit{    
    public void grow(){    
            System.out.println("�㽶������...");    
    }    
    public void eat(){    
            System.out.println("���㽶...");    
    }    
}    
class Factory{    
    public static Fruit getFruit(String className){    
            Fruit f = null;    
            try{    
                    f = (Fruit) Class.forName(className).newInstance();  
            }catch (Exception e){}    
            return f;    
    }    
}    
class PropertyOperate{    
    private Properties pro = null;    
    public PropertyOperate(){    
            this.pro = new Properties();    
            this.load();    
    }    
    //����һ�����ط���    
    public Properties getPro(){    
            return this.pro;    
    }    
    //���ļ��ж������ԣ�����ļ������ڣ��򴴽�һ��Ĭ�ϵ�    
    private void save(){    
            pro.setProperty("a","Apple");    
            pro.setProperty("o","Orange");    
            //�������ļ�֮��    
            try{    
                    pro.storeToXML(new FileOutputStream(new File("e:\\fruit.xml")),"FRUIT FACTORY");    
            }catch (Exception e){}    
    }    
    private void load(){    
            File f = new File("e:\\fruit.xml");    
            if(f.exists()){    
                    //�ļ���������Զ�ȡ    
                    try{    
                            pro.loadFromXML(new FileInputStream(f));    
                    }catch (Exception e){}    
            }else{    
                    //���д���    
                    this.save();    
            }    
    }    
}    
class InputData{    
    private BufferedReader buf = null;    
    public InputData(){    
            this.buf = new BufferedReader(new InputStreamReader(System.in));    
    }    
    public String getString(){    
            String str = null;    
            try{    
                    str = this.buf.readLine();    
            }catch(Exception e){}    
            return str;    
    }    
} 
public class Factoty001 {
	public static void main(String args[]){    
        Properties p = new PropertyOperate().getPro();    
        System.out.println(p);    
        System.out.print("��ѡ������Ҫ�����ͣ�");    
        String str = new InputData().getString();  
        //��һ����չ�����ڿ������û��Լ�����Ҫʹ�õ�����    
        Fruit f = Factory.getFruit(p.getProperty(str));
		f.grow();   
	}
}

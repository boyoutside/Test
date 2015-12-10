package test;

import java.io.*;
import java.util.*;

interface Fruit{    
    public void grow();    
    public void eat();    
}    
class Apple implements Fruit{    
    public void grow(){    
            System.out.println("苹果在生长...");    
    }    
    public void eat(){    
            System.out.println("吃苹果...");    
    }    
}    
class Orange implements Fruit{    
    public void grow(){    
            System.out.println("橘子在生长...");    
    }    
    public void eat(){    
            System.out.println("吃橘子...");    
    }    
}    
class Banana implements Fruit{    
    public void grow(){    
            System.out.println("香蕉在生长...");    
    }    
    public void eat(){    
            System.out.println("吃香蕉...");    
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
    //设置一个返回方法    
    public Properties getPro(){    
            return this.pro;    
    }    
    //从文件中读出属性，如果文件不存在，则创建一个默认的    
    private void save(){    
            pro.setProperty("a","Apple");    
            pro.setProperty("o","Orange");    
            //保存在文件之中    
            try{    
                    pro.storeToXML(new FileOutputStream(new File("e:\\fruit.xml")),"FRUIT FACTORY");    
            }catch (Exception e){}    
    }    
    private void load(){    
            File f = new File("e:\\fruit.xml");    
            if(f.exists()){    
                    //文件存在则可以读取    
                    try{    
                            pro.loadFromXML(new FileInputStream(f));    
                    }catch (Exception e){}    
            }else{    
                    //进行创建    
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
        System.out.print("请选择所需要的类型：");    
        String str = new InputData().getString();  
        //进一步扩展，现在可以由用户自己输入要使用的类型    
        Fruit f = Factory.getFruit(p.getProperty(str));
		f.grow();   
	}
}

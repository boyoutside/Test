package test;

import java.io.*;

//序列化跟反序列化实现接口
//定义不允许序列化的关键词==transient
@SuppressWarnings("serial")
class Person implements Serializable{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
public class Serializable1{
	public static void main(String args[]) throws Exception{
//			ser(new Person("张三",20));
		dser();
	}
	public static void ser(Person p) throws Exception{
		ObjectOutputStream out=null;
		out=new ObjectOutputStream(new FileOutputStream("d:\\serialize"));
		out.writeObject(p);
		out.close();
	}
	public static void dser() throws Exception{
		ObjectInputStream in=null;
		in=new ObjectInputStream(new FileInputStream("d:\\serialize"));
		Object obj=in.readObject();
		Person p=(Person)obj;
		System.out.println(p);
		in.close();
	}
}

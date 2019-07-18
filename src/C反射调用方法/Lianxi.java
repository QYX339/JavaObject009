package C反射调用方法;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.util.Scanner;

/**
 * 定义一个学生类 , 其中包含姓名,年龄,成绩的属性 之后由键盘输入学生的各种内容,并将内容保存在文件中
 * 
 * 要求全部的操作都使用反射机制完成 , 既不能使用通过关键字new创建学生类对象的操作
 * 
 * @author Administrator
 *
 */
public class Lianxi {
	public static void main(String[] args) {
		try {
			File file = new File("E:\\Eclipse IDE\\JavaObject009\\src\\C反射调用方法\\students.txt");
			FileWriter fw = new FileWriter(file, true);
			boolean flag = true;
			Class<?> a = Class.forName("C反射调用方法.Student");
//			Constructor[] constructors = a.getConstructors();
			Constructor constructor = a.getConstructor(String.class, int.class, double.class);
			while (flag) {
				Scanner input = new Scanner(System.in);
				System.out.println("请输入学生姓名：");
				String name = input.nextLine();
				System.out.println("请输入学生年龄：");
				int age = input.nextInt();
				System.out.println("请输入学生成绩：");
				double grade = input.nextDouble();
				Student s = (Student) constructor.newInstance(name, age, grade);
//				Student s = (Student) constructors[1].newInstance(name, age, grade);
				System.out.println(s);
				fw.write(s.toString() + "\r");
				System.out.println("要继续创建学生吗？(true/false)");
				flag = input.nextBoolean();
			}
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

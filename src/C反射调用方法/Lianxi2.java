package C反射调用方法;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Lianxi2 {

	public static void main(String[] args) {
		try {

			File file = new File("E:\\Eclipse IDE\\JavaObject009\\src\\C反射调用方法\\students.txt");
			FileWriter fw = new FileWriter(file, true);
			boolean flag = true;
			Class<?> a = Class.forName("C反射调用方法.Student");
			while (flag) {
				Scanner input = new Scanner(System.in);
				System.out.println("请输入学生姓名：");
				String name = input.nextLine();
				System.out.println("请输入学生年龄：");
				int age = input.nextInt();
				System.out.println("请输入学生成绩：");
				double grade = input.nextDouble();
				Student student = (Student) a.newInstance();
				Method setName = a.getMethod("setName", String.class);
				Method setAge = a.getMethod("setAge", int.class);
				Method setGrade = a.getMethod("setGrade", double.class);
				setName.invoke(student, name);
				setAge.invoke(student, age);
				setGrade.invoke(student, grade);
				System.out.println(student);
				fw.write(student.toString() + "\r");
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

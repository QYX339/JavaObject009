package C������÷���;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Lianxi2 {

	public static void main(String[] args) {
		try {

			File file = new File("E:\\Eclipse IDE\\JavaObject009\\src\\C������÷���\\students.txt");
			FileWriter fw = new FileWriter(file, true);
			boolean flag = true;
			Class<?> a = Class.forName("C������÷���.Student");
			while (flag) {
				Scanner input = new Scanner(System.in);
				System.out.println("������ѧ��������");
				String name = input.nextLine();
				System.out.println("������ѧ�����䣺");
				int age = input.nextInt();
				System.out.println("������ѧ���ɼ���");
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
				System.out.println("Ҫ��������ѧ����(true/false)");
				flag = input.nextBoolean();

			}

			fw.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package C������÷���;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.util.Scanner;

/**
 * ����һ��ѧ���� , ���а�������,����,�ɼ������� ֮���ɼ�������ѧ���ĸ�������,�������ݱ������ļ���
 * 
 * Ҫ��ȫ���Ĳ�����ʹ�÷��������� , �Ȳ���ʹ��ͨ���ؼ���new����ѧ�������Ĳ���
 * 
 * @author Administrator
 *
 */
public class Lianxi {
	public static void main(String[] args) {
		try {
			File file = new File("E:\\Eclipse IDE\\JavaObject009\\src\\C������÷���\\students.txt");
			FileWriter fw = new FileWriter(file, true);
			boolean flag = true;
			Class<?> a = Class.forName("C������÷���.Student");
//			Constructor[] constructors = a.getConstructors();
			Constructor constructor = a.getConstructor(String.class, int.class, double.class);
			while (flag) {
				Scanner input = new Scanner(System.in);
				System.out.println("������ѧ��������");
				String name = input.nextLine();
				System.out.println("������ѧ�����䣺");
				int age = input.nextInt();
				System.out.println("������ѧ���ɼ���");
				double grade = input.nextDouble();
				Student s = (Student) constructor.newInstance(name, age, grade);
//				Student s = (Student) constructors[1].newInstance(name, age, grade);
				System.out.println(s);
				fw.write(s.toString() + "\r");
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

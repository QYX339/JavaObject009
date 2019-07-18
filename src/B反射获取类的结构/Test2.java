package B�����ȡ��Ľṹ;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {

	public static void main(String[] args) {
		try {
			
			Class<?> a = Class.forName("B�����ȡ��Ľṹ.Person");
			Class<?>[] interfaces = a.getInterfaces();
			System.out.println("�ӿڣ�");
			for(Class<?> i : interfaces) {
				System.out.println(i.getName());
			}
			Class<?> superClass = a.getSuperclass();
			System.out.println("���ࣺ");
			System.out.println(superClass.getName());
			Field[] declaredFields = a.getDeclaredFields();
			System.out.println("�������ԣ�");
			for(Field f : declaredFields) {
				int mo = f.getModifiers();
//				System.print(Modifier.)
				System.out.println(f.getName());
			}
			Field[] fields = a.getFields();
			System.out.println("���༰�ӿ��е����ԣ�");
			for(Field f : fields) {
				System.out.println(f.getName());
			}
			Method[] declaredMethods = a.getDeclaredMethods();
			System.out.println("���෽����");
			for(Method m : declaredMethods) {
				System.out.println(m.getName());
			}
			Method[] methods = a.getMethods();
			System.out.println("���༰�ӿ��еķ���");
			for(Method m : methods) {
				System.out.println(m.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

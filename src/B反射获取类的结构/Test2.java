package B反射获取类的结构;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {

	public static void main(String[] args) {
		try {
			
			Class<?> a = Class.forName("B反射获取类的结构.Person");
			Class<?>[] interfaces = a.getInterfaces();
			System.out.println("接口：");
			for(Class<?> i : interfaces) {
				System.out.println(i.getName());
			}
			Class<?> superClass = a.getSuperclass();
			System.out.println("父类：");
			System.out.println(superClass.getName());
			Field[] declaredFields = a.getDeclaredFields();
			System.out.println("本类属性：");
			for(Field f : declaredFields) {
				int mo = f.getModifiers();
//				System.print(Modifier.)
				System.out.println(f.getName());
			}
			Field[] fields = a.getFields();
			System.out.println("父类及接口中的属性：");
			for(Field f : fields) {
				System.out.println(f.getName());
			}
			Method[] declaredMethods = a.getDeclaredMethods();
			System.out.println("本类方法：");
			for(Method m : declaredMethods) {
				System.out.println(m.getName());
			}
			Method[] methods = a.getMethods();
			System.out.println("父类及接口中的方法");
			for(Method m : methods) {
				System.out.println(m.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

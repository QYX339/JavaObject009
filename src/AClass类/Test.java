package AClass¿‡;

import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) {
		String s = new String("abc");
		System.out.println(s.getClass());
		System.out.println(s.getClass().getName());
		try {
			
			Class<?> a = Class.forName("java.lang.String");
			
			Constructor<?>[] constructors  = a.getConstructors();
			
			String x = (String) a.newInstance();
			System.out.println(x);
			
			for(Constructor<?> c : constructors) {
				System.out.println(c.getParameterCount());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

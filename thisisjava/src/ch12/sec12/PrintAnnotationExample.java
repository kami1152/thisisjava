package ch12.sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		Service service = new Service();

		for(Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			if (printAnnotation != null) {
				//설정 정보를 이용해서 선 출력
				printLine(printAnnotation);
			}
			//메소드 호출
			try {
//				service.method1();
//				service.method1(service);
				method.invoke(service);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (printAnnotation != null) {
				//설정 정보를 이용해서 선 출력
				printLine(printAnnotation);
			}
		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			//number 속성값 얻기
			final int number = printAnnotation.number();
			//value 속성값 얻기
			final String value = printAnnotation.value();
			for(int i=0; i<number; i++) {
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
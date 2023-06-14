package p004;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.spi.FileSystemProvider;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {
		Class clazz=Service.class;
		Method[] mt = clazz.getDeclaredMethods();
		for(Method i:mt) {
			PrintAnnotation printAnnotation = i.getAnnotation(PrintAnnotation.class);
			i.invoke(new Service());
			printLine(printAnnotation);
		}

	}

	private static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation!=null) {
			int number=printAnnotation.number();
			for(int i=0; i<number; i++) {
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}

}

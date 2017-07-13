package ErrorHandling;

import java.util.Arrays;

public class MyClass {
	
	public void index(){
		try {
			String[] data = new String[3];
			data[0] = "Hello";
			data[1] = "World";
			data[2] = "Xsis";
			data[3] = "Mitra";
			data[5] = "Utama";
			System.out.println(Arrays.toString(data));
		} catch (Exception e) {
			System.out.println("nGantukkkkzzz");
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		mc.index();
	}
}

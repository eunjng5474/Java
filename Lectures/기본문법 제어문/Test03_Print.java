package day0317;

public class Test03_Print {

	public static void main(String[] args) {
		// print: "문자열"
		// println: "문자열" + "\n"
		// printf: %d, %s, %c, ... 형식 지정자 
		
		System.out.print("Hello SSAFY!\n");
		System.out.print("Hello Great 9th!\n");
		
		System.out.println("\\");
		System.out.println("\"");
		
		System.out.printf("%d\n", 10);
		System.out.printf("%4d\n", 10);   // 4칸을 확보한 다음, 오른쪽 정렬
		System.out.printf("%-4d\n", 10);
		System.out.printf("%04d\n", 10);
		
		System.out.printf("%f\n", 10.1);
		System.out.printf("%f\n", 10.12345678);
		System.out.printf("%.2f\n", 10.12345678);
		

	}

}

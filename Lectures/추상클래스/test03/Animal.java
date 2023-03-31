package test03;

// 1. 굳이 객체를 생성할 필요가 없음. 
// 2. 추상 메서드를 갖는 클래스 
// 3. abstract 키워드 
abstract public class Animal {
	// 추상메서드
	// 1. abstract 키워드 
	// 2. ;으로 종료 
	// - {} 블록이 없음. 내용(구현부)이 없음. 
	abstract public void speak();
	// 1. 접근제한자: public, (default), protected, private 
	// 2. 그외 제한자(지정예약어): static, final, abstract 
	// 1과 2의 순서는 서로 상관 없다.
	
	public static int a = 10;
	static public int b = 20;
	
	// 추상클래스는 추상메서드도 가질 수 있지만, 일반 메서드도 가질 수 있음 
	public void eat() {
		
	}

}

package hw250430;

public interface Human {
	default void print() {
		System.out.println("인간입니다.");
	}
	void eat();
	static void echo() {
		System.out.println("야호!!!");
		
	}
   
}

class Worker implements Human {
	
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
	
}

class Student implements Human {
	
	static int age;
	
//	Worker w = new Worker();
//	
//	public void print() {
//		System.out.println("인간입니다.");
//	} 
	
	public Student(int age) {
		this.age = age;
	}
	
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}
	
	public void print() {
		System.out.println(Student.age + "세의 학생입니다.");
	}
	
	public void echo() {
		System.out.println("야호!!!!!");
	}
	

}

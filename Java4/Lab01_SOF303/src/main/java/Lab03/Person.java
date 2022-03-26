package Lab03;

public class Person {
	private final String name;
	private final int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		if(age<=0) {
			throw new IllegalArgumentException("Invalid age:"+age);
		}
		else if(age<15) {
			throw new IllegalArgumentException("Chưa đủ tuổi lao động:"+age);
		}
		else if(age>65) {
			throw new IllegalArgumentException("Nghỉ ngơi đi bác ơi:"+age);
		}
	}
}

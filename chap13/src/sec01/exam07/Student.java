package sec01.exam07;

public class Student {

	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	// hashSet의 객체 비교를 위해서는 equals 와 hashcode 메소드를 재정의 해야함
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		Student student = (Student) obj;
		return (sno == student.sno && name == student.name);
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}
}

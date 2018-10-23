package intro.to.java.ch11.pe;

public class Student extends Person {
	public static final String FRESHMAN = "freshman";
	public static final String SOPHOMORE = "sophomore";
	public static final String JUNIOR = "junior";
	public static final String SENIOR = "senior";
	
	private int studentNo;
	
	public Student() {
	}
	
	public Student(String name, String address, int studentNo) {
		setName(name);
		setAddress(address);
		this.studentNo = studentNo;
	}
	
	public int getStudentNo() {
		return studentNo;
	}
	
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	@Override
	public String toString() {
		return "Student Name: " + getName() + "\n"
				+ "Student Number: " + studentNo;
	}
}

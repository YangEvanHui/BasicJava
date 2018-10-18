package intro.to.java.ch11;

class DBPerson extends Object {
	@Override
	public String toString() {
		return "Person";
	}
}

class Student extends DBPerson {
	@Override
	public String toString() {
		return "Student";
	}
}

class GraduateStudent extends Student {
}

public class DynamicBindingDemo {
	public static void m(Object x) {
		System.out.println(x.toString());
	}
	
	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new DBPerson());
		m(new Object());
	}
}

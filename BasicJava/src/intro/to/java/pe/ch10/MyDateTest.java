package intro.to.java.pe.ch10;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(34355555133101L);
		System.out.println(date1.toString() + "\n\n" +
				date2.toString());
	}
}

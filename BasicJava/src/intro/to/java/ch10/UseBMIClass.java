package intro.to.java.ch10;

public class UseBMIClass {
	public static void main(String[] args) {
		BMI bmi1 = new BMI("Evan Yang", 18, 145, 70);
		System.out.println("The BMI for " + bmi1.getName() + " is " +
				bmi1.getBMI() + " " + bmi1.getStatus());
		
		BMI bmi2 = new BMI("Eve Zhao", 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is " +
				bmi2.getBMI() + " " + bmi2.getStatus());
	}
}

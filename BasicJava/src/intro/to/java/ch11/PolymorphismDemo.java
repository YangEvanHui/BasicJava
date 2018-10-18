package intro.to.java.ch11;

public class PolymorphismDemo {
	public static void displayObject(SimpleGeometricObject object) {
		System.out.println("Created on " + object.getDateCreated()
				+ ". Color is " + object.getColor());
	}
	
	public static void main(String[] args) {
		displayObject(
				new CircleFromSimpleGeometricObject(1, "red", false));
		displayObject(
				new RectangleFromSimpleGeometricObject(1, 1, "black", true));
	}
}

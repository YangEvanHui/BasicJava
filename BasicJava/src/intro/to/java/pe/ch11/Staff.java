package intro.to.java.pe.ch11;

public class Staff extends Employee {
	private String title;
	
	public Staff() {
	}
	
	public Staff(String name, String address, String title) {
		setName(name);
		setAddress(address);
		setTitle(title);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Staff Name: " + getName() +
				"\nStaff Address: " + getAddress() + "\nTitle: " + title;
	}
}

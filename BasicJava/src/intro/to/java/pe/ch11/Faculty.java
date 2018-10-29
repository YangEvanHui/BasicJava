package intro.to.java.pe.ch11;

public class Faculty extends Employee {
	private double officeHours;
	private String rank;
	
	public Faculty() {
	}
	
	public Faculty(String name, String address,
			double officeHours, String rank) {
		setName(name);
		setAddress(address);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public double getOfficeHours() {
		return officeHours;
	}
	
	public void setOfficeHours(double officeHours) {
		this.officeHours = officeHours;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Faculty Name: " + getName() + "\n" +
				"Office Hours: " + officeHours + "\nRank: " + rank;
	}
}

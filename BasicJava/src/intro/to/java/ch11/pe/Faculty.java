package intro.to.java.ch11.pe;

public class Faculty extends Employee {
	private double officeHours;
	private String rank;
	
	public Faculty() {
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
}

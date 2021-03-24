package calisan;

public class Boss extends employee {
	private double haftalik;

	public double getHaftalik() {
		return haftalik;
	}

	public void setHaftalik(double haftalik) {
		this.haftalik = haftalik;
	}

	public Boss(String firstName, String lastName, double haftalik) {
		super(firstName, lastName);
		this.haftalik = haftalik;
	}
	
	public  double earnings() {
		return haftalik;
	}

	@Override
	public String toString() {
		return "Boss [haftalik=" + haftalik + ", Employee=" + super.toString() + "]";
	}
	

}

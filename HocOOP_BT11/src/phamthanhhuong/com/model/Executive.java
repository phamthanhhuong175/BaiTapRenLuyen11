package phamthanhhuong.com.model;

public class Executive extends Emloyee {
	private double bonus;
	public void awardBonus(double bonus)
	{
		this.bonus=bonus;
		System.out.println("Lãnh bonus = "+bonus);
	}
	public double pay()
	{
		return super.pay()+this.bonus;
	}
}

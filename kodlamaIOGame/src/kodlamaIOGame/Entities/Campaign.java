package kodlamaIOGame.Entities;

import kodlamaIOGame.Abstract.EntityService;

public class Campaign implements EntityService {

	private String name;
	private int id;
	private double discountRate;
	
	public Campaign(String name, int id , double discountRate) {
		super();
		this.name = name;
		this.id = id;
		this.discountRate = discountRate;
	}

	public Campaign() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}

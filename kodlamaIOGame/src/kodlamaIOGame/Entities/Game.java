package kodlamaIOGame.Entities;

import kodlamaIOGame.Abstract.EntityService;

public class Game implements EntityService{
	private int id;
	private String name;
	private int price;
	private String category;
	private double priceAfterDiscountRate;
	private Campaign campaign;
	
	
	public Game() {
		
	}

	public Game(int id, String name, int price, String category ,Campaign campaign ) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.campaign = campaign;
		
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPriceAfterDiscountRate() {
		return price - ((price*campaign.getDiscountRate())/100);
	}

	public void setPriceAfterDiscountRate(double priceAfterDiscountRate) {
		this.priceAfterDiscountRate = priceAfterDiscountRate;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	
	
}

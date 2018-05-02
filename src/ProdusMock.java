
public class ProdusMock implements IProdus{
	boolean onSale;
	float price;
	
	//de adaugat setteri

	@Override
	public boolean isOnSale() {
		// TODO Auto-generated method stub
		return onSale;
	}

	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

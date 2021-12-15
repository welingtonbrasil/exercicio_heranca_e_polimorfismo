package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double custemsFee) {
		super(name, price);
		this.customsFee = custemsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return super.price + customsFee;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.priceTag());
		sb.append(" (Custems fee: $ "+ customsFee + ")");
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return priceTag();
	}
	
	
}

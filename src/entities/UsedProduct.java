package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		//sb.append("PRICE TAGS:\n");
		sb.append(super.name + " (used) $ ");
		sb.append(super.price);
		sb.append(" (Manufacture date: "+ sdf.format(manufactureDate) +")");
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return priceTag();
	}
	
}

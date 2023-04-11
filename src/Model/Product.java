package Model;

public abstract class Product {
	private static int productCounter = 100;
	protected int price;
	protected int warrantyMonths;
	protected int discountPercent;
	protected final int productId;
	protected Distributor distributor;
	
	public Product(int price, int warrantyMonths, int discountPercent, Distributor distributor) {
		this.price = price;
		this.warrantyMonths = warrantyMonths;
		this.discountPercent = discountPercent;
		this.productId = Product.productCounter;
		Product.productCounter++;
		this.distributor = distributor;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getWarrantyMonths() {
		return warrantyMonths;
	}
	
	public void setWarrantyMonths(int warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
	}
	
	public int getDiscountPercent() {
		return discountPercent;
	}
	
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	
	public Distributor getDistributor() {
		return distributor;
	}
	
	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}
	
	public int getProductId() {
		return productId;
	}
	
	@Override
	public String toString() {
		return "Product{" +
				"price=" + price +
				", warrantyMonths=" + warrantyMonths +
				", discountPercent=" + discountPercent +
				", productId=" + productId +
				", distributor=" + distributor +
				'}';
	}
}

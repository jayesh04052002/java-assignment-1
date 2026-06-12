class Product
{
	private int productId;
	private String productName;
	private int price;
	private String category;
	
	Product(int productId, String productName, int price, String category)
	{
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
	
	public void setProductId()
	{
		this.productId=productId;
	}
	public int getProductId()
	{
		return productId;
	}
	
	public void setProductName()
	{
		this.productName = productName;
	}
	public String getProductName()
	{
		return productName;
	}
	
	public void setPrice()
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
	public void setCategory()
	{
		this.category = category;
	}
	public String getCategory()
	{
		return category;
	}
	
	public String toString()
	{
		return "{Product= Product Id:" +productId+ ",Product Name:" +productName+ ",Price:" +price+ ",Category:" +category+"}";
	}
	
	public boolean equals(Object obj)
	{
		Product p = (Product) obj;
		return getProductId() == p.getProductId();
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Product p1 = new Product(101,"Laptop",50000,"Electronics");
		Product p2 = new Product(101,"Mobile",25000,"Electronics");
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.equals(p2));
	}
}
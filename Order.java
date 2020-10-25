package onlineshopping;
import java.util.Scanner;
public class Order extends Customer
{

	private int orderid;
	private int productid;
	private double amount;
	private String orderdate;
	
	public void createorder()
	{
        
	}
	
	public void editorder()
	{
		
	}
	
	
	public void cancelorder()
	{
		
	}
	
	
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order ob =new Order(); 
        ob.setCustomerid(5874454);
        System.out.println(ob.getCustomerid());
	}

}

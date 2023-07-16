package Training_27_June.StreamAp;

public class Product {
private int srNo;
private String pName;
private float price;
@Override
public String toString() {
	return "Product [srNo=" + srNo + ", pName=" + pName + ", price=" + price + "]";
}
public Product(int srNo, String pName, float price) {
	super();
	this.srNo = srNo;
	this.pName = pName;
	this.price = price;
}
public int getSrNo() {
	return srNo;
}
public void setSrNo(int srNo) {
	this.srNo = srNo;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
}

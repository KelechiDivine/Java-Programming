package chapterThree.exercises;

public class InvoiceClass {
	
	String partNumber;
	String partDescription;
	int qualityOfItem;
	double pricePerTime;
	
	
	public InvoiceClass(String partNumber, String partDescription
			, int qualityOfItem, double pricePerTime) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.qualityOfItem = qualityOfItem;
		this.pricePerTime = pricePerTime;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public int getQualityOfItem() {
		return qualityOfItem;
	}
	
	public void setQualityOfItem(int qualityOfItem) {
		this.qualityOfItem = qualityOfItem;
	}
	
	public double getPricePerTime() {
		return pricePerTime;
	}
	
	public void setPricePerTime(double pricePerTime) {
		this.pricePerTime = pricePerTime;
	}
	
	public double getInvoiceAmount(){
		return qualityOfItem * pricePerTime;
	}
}

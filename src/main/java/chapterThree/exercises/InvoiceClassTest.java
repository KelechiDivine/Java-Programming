package chapterThree.exercises;

public class InvoiceClassTest {
	
	public static void main(String[] args){
	
//		(Invoice Class) Create a class called Invoice that a hardware store might use to represent
//				an invoice for an item sold at the store. An Invoice should include four pieces of information as
//		instance variables—a part number (type String), a part description (type String), a quantity of the
//		item being purchased (type int) and a price per item (double). Your class should have a constructor
//				that initializes the four instance variables. Provide a set and a get method for each instance variable.
//				In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//				multiplies the quantity by the price per item), then returns the amount as a double value. If the
//		quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
//		0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
	
		
		InvoiceClass invoiceClass = new InvoiceClass("5374aqi", "This for the lost children",
													-2, -400);
		
		InvoiceClass secondInvoiceClass = new InvoiceClass("A87y6", "This is for kelechi",
															-3, -232);
		
		if (invoiceClass.getQualityOfItem() < 0)
			invoiceClass.setQualityOfItem(0);
		
		if (invoiceClass.getPricePerTime() < 0)
			invoiceClass.setPricePerTime(0);
			
		System.out.printf("Invoice 1: %s\t%s\t%d\t$%.2f\n", invoiceClass.getPartNumber(),
				invoiceClass.getPartDescription(), invoiceClass.getQualityOfItem(), invoiceClass.getPricePerTime());

		if (secondInvoiceClass.getQualityOfItem() < 0)
			secondInvoiceClass.setQualityOfItem(0);
		
		if (secondInvoiceClass.getPricePerTime() < 0)
			secondInvoiceClass.setPricePerTime(0);
		
		System.out.printf("Invoice 2: %s\t%s\t%d\t$%.2f\n", secondInvoiceClass.getPartNumber(),
				secondInvoiceClass.getPartDescription(), secondInvoiceClass.getQualityOfItem(), secondInvoiceClass.getPricePerTime());
	}
}

package LAB_02;


public class Q2_InvoiceTest {
    public static void main(String[] args) {
        Invoice inv = new Invoice("101", "Mouse", 5, 250);
        System.out.println("Invoice Amount = " + inv.getInvoiceAmount());
    }
}

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = (quantity > 0) ? quantity : 0;
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }

    // set methods
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0;
    }

    // Get methods
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Method to calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

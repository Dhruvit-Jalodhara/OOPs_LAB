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

    public Invoice(String pn, String pd, int q, double price) {
        partNumber = pn;
        partDescription = pd;
        quantity = (q > 0) ? q : 0;
        pricePerItem = (price > 0) ? price : 0.0;
    }

    public void setQuantity(int q) {
        quantity = (q > 0) ? q : 0;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

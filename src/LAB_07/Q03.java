package LAB_07;


class Book{
    int bookID;
    String title;
    String author;
    double price;
    Book(int bookID,String title,String author,double price){
        this.author=author;
        this.title=title;
        this.bookID=bookID;
        this.price=price;
    }
    void getDetails(){
        System.out.println("Book Detailes:");
        System.out.println("Book ID :"+bookID);
        System.out.println("Title :"+title);
        System.out.println("Author :"+author);
        System.out.println("Price :"+price);
    }
}
class Periodical extends Book{
    int period;
    Periodical(int bookID,String title,String author,double price,int period){
        super(bookID, title, author, price);
        this.period=period;
    }

    void setPrice(double price){
        this.price=price;
    }
    void setPeriod(int period){
        this.period=period;
    }

    void getDetails(){
        try{
            if(price<0){
                throw new Exception("Price cannot become negative");
            }
            if(period<0){
                throw new Exception("Period cannot become negative");
            }
            System.out.println("Periodical Detailes:");
            System.out.println("Book ID :"+bookID);
            System.out.println("Title :"+title);
            System.out.println("Author :"+author);
            System.out.println("Price :"+price);
            System.out.println("Period :"+period);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }


}

public class Q03 {
    public static void main(String[] args) {
        Book b1=new Book(123, "Maths", "Kamlesh", 100);
        b1.getDetails();
        Periodical p1=new Periodical(456, "Science", "Kamlesh", 110, 7);
        p1.setPeriod(8);
        p1.getDetails();
    }
}


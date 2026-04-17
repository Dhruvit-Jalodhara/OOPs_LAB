package LAB_07;

import java.util.Scanner;
class WrongFormatOfDetails extends Exception{
    public WrongFormatOfDetails(String msg){
        super(msg);
    }
}
class SimpleInterestCalculator{
    double principal,annualInterestRate,numberOfMonths,year,balance;
    Scanner sc=new Scanner(System.in);
    void getDetails(){

        while(true){
            try{
                System.out.println("Enter the principal amount :");
                principal=sc.nextDouble();
                if(principal<0) throw new WrongFormatOfDetails("Principal amount is not negetive ");
                break;
            }
            catch(WrongFormatOfDetails ex){
                System.out.println("Exception caught :"+ex.getMessage());
            }
        }
        while(true){
            try{
                System.out.println("Enter the Annual Interest Rate (in decimal):");
                annualInterestRate=sc.nextDouble();
                if((annualInterestRate-(int)annualInterestRate)==0) throw new WrongFormatOfDetails("Annual interest are in decimal not integer");
                if(annualInterestRate<0 || annualInterestRate>1) throw new WrongFormatOfDetails("this annual interest are not acceptable");
                break;
            }
            catch(WrongFormatOfDetails ex){
                System.out.println("Exception caught :"+ex.getMessage());
            }
        }

        while(true){
            try{
                System.out.println("Enter the number of Months");
                numberOfMonths=sc.nextDouble();
                if(numberOfMonths<0) throw new WrongFormatOfDetails("Number of Months are not negetive ");
                else if((numberOfMonths-(int)numberOfMonths)!=0) throw new WrongFormatOfDetails("Number of Months are not decimal ");
                break;
            }
            catch(WrongFormatOfDetails ex){
                System.out.println("Exception caught :"+ex.getMessage());
            }
        }


    }
    void printDetails(){
        double year=numberOfMonths/12;
        double balance=principal+year*principal*annualInterestRate;
        System.out.println("The balance is "+balance);
    }
}
public class Q01 {
    public static void main(String[] args) {
        SimpleInterestCalculator s1=new SimpleInterestCalculator();
        s1.getDetails();
        s1.printDetails();
    }
}


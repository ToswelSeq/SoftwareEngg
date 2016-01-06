package onlinepayment;
import java.util.Scanner;


public class paymentmain {


public static void main(String args[]){

	int choice;
	int itemno,price;
	
item itemsample1 = new item();

itemsample1.setitemno(1001);
itemno=itemsample1.getitemno();

itemsample1.setprice(200);
price=itemsample1.getprice();

//System.out.println(itemno);
//System.out.println(price);

    System.out.println("\nSelect payment option");
    System.out.println("1. debit card");
    System.out.println("2. credit card");
    System.out.println("3. cash on delivery");
    
    Scanner input = new Scanner(System.in);   
    
  choice=input.nextInt();
  
  if(choice==1 ||choice==2 ||choice==3)
  {
Site flipkart = new Site();

flipkart.choosemode(choice);
flipkart.makepayment(itemno,price);
       
  }
  
  else
	  System.out.println("invalid selection");
}

}
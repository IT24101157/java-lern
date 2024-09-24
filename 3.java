import java.util.Scanner;
  public class IT24101157A{
      public static void main(String[] args){
          Scanner mykey = new Scanner(System.in);
          for(int i=1;i<6;i++){
              System.out.println("Customer "+i);

              System.out.print("Enter total bill amount :");
              double totalAmount = mykey.nextDouble();

              System.out.print("Enter the mode of payment(C for cash,0 for other): ");
              char mode = mykey.next().charAt(0);
              if(mode=='c' ||mode=='C') {
                  double discount =totalAmount * 5.0 / 100.0;

                  System.out.println("Discount is: "+ discount);
                  double No =totalAmount - discount;
                  System.out.println("Amount to be paid: "+No);
              }else if(mode=='o' ||mode=='O'){
                  System.out.println("No discount applicable");
                  System.out.println("Amount to be paid: "+totalAmount);
              }else{
                  System.out.println("Payment mode is not valid");
              }
              System.out.println();
             
          }
      }
  }

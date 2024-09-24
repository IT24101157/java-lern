import java.util.Scanner;

  public class iT24101157{
     public static void main(String []args){
     Scanner mykey = new Scanner(System.in);
     
     System.out.print("Enter a number:");
     int number = mykey.nextInt();

     if (number>0){
      System.out.println("The number is: Positive");
     }else if(number<0){
       System.out.println("The number is: Negative");
     }else{
       System.out.println("The number is: Zero");
     
     }
     mykey.close();
  }
}

import java.util.Scanner;
  public class yoo {
      public static void main(String[]args){
      
      int [] notes ={5000,1000,500,200,100,50,20,10,5,2};
      Scanner mykey = new Scanner(System.in);
      int rupees = mykey.nextInt();
      for(int i=0; i<notes.length; i++){
          int n = rupees/notes[i];
          if(notes[i]==5 || notes[i]==2)
              System.out.println("number of "+notes[i]+" coins " + n);
          else
              System.out.println("number of "+notes[i]+" notes " + n);
          
    rupees %= notes[i];
    }
  }
       
      
    }
    
  

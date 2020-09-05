import java.util.Scanner;

public class bappisguessgame{

    public static void main (String[] args){

            System.out.println("Welcome to 1-10 Guessing Game");

            Scanner p1 = new Scanner(System.in);
            Scanner p2 = new Scanner(System.in);
            boolean right = false;
            boolean left = false;
            int p1input; 
            int p2input;
               
                System.out.println("Player 1 insert a secret number");
                p1input = p1.nextInt();
            
             while (!left){
                          if ( p1input <=10 ){
                   left = true;
            }
                else {
                    System.out.println("p1 enter no. below 10");
                             p1input = p1.nextInt();    
                }
             }

            while (!right) {
                System.out.println("Player 2 guess the number");
              p2input = p2.nextInt();

               if ( p2input == p1input){
                   right = true;
                 System.out.println("You win");
               }
             else if ( p2input < p1input){
                 System.out.println("try a higher value:" + p1input);
             }
                 else {
                 System.out.println("try a lower value:" + p1input);
             }     
            
            } 
    }
}

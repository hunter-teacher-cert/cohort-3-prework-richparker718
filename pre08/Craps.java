import java.io.*;
import java.util.*;

public class Craps{


// roll which accepts an integer parameter and returns a random number between 1 and that number, inclusive. 
public static int roll(int a){

Random random = new Random();
int n= random.nextInt(a)+1;
 return n;

}
//shoot which accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.
public static int shoot(int a, int b){

 int c =roll(b)+roll(b);
  return c;
  
 
 

}
 //round. It should accept no parameters and it should return something to indicate if the shooter of the round wins or loses.

 //A round is played as follows:

//The shooter shoots (rolls) the dice.

//If he rolls a 2,3, or 12,that’s Craps and he loses.

//If he rolls a 7 or 11, that’s a Natural and he wins.
//Otherwise: the value he rolled is now called the Point
//the shooter continues to shoot (roll) until he either rolls the Point again at which point he wins or he rolls a 7 at which point he loses.

 public static void round() {

   int i =1;
   int a = shoot(2,6);
   System.out.println("roll " + i +": " +a);

   if(!(a==2||a==3||a==12||a==7||a==11)){
       System.out.println("Your point is: " +a );
   }
  
   if (a==2||a==3||a==12){
     System.out.println("Craps you lose!");
     
   } else if(a==7||a==11){
     
     System.out.println("Natural you win!");
     
   }else{

     int point =a;
     int b=shoot(2,6);
     i++;
     System.out.println("roll " + i +": " +b);
     
     boolean end = false;
     
      while(end==false){
     if(point==b){
       System.out.println("You win!");
       end = true;
     }else if (b==7){
       System.out.println("You lose!");
      end = true;
     } else{
       b = shoot(2,6);
       i++;
       System.out.println("roll " + i +": " +b);
        
     }
      
   }
     }
      }
   
public static void main(String[] args){
//The main program should take a parameter from the command line, play that many rounds and as it plays indicate each time the shooter wins or loses. The program should also print out the status of the rounds they occur.

  for (int i=1; i<= Integer.parseInt(args[0]); i++){
    System.out.println("Round " +i);
     round();
       System.out.println();

}
  }
}
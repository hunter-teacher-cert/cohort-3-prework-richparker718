import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Craps{

 public static void gameInstructions(){
   newLine();
System.out.println("GAME INSTRUCTIONS:");
  
System.out.println("A round is played with the shooter rolling the dice.");
   newLine();

System.out.println("If a 2,3, or 12 is rolled, that’s Craps and they lose.");
   newLine();
   
System.out.println("If a 7 or 11 is rolled, that’s a Natural and they win.");
   newLine();
   
System.out.println("Otherwise, the value rolled is now called the Point.");
newLine();
   
System.out.println("The shooter continues to shoot(roll) until they either roll the Point again indicating a win or they roll a 7 indicating a loss.");
newLine();
newLine();
 }
  


public static void newLine(){
    System.out.println();
  }

public static int roll(int a){

Random random = new Random();
int n= random.nextInt(a)+1;
 return n;
}
  
  public static void pauseToContinue(){
  Scanner in = new Scanner(System.in);
  System.out.println("click return to roll dice");
  in.nextLine();
  }

public static int shoot(int a, int b){
  pauseToContinue();
  int c = roll(b)+roll(b);
  return c;
}

 public static void round() {

   int i =1;
   int a = shoot(2,6);
   System.out.println("roll " + i +": " +a);

   if(!(a==2||a==3||a==12||a==7||a==11)){
       System.out.println("Your Point is: " +a );
   }
  
   if (a==2||a==3||a==12){
     System.out.println("CRAPS, YOU LOSE!");
     
   } else if(a==7||a==11){
     
     System.out.println("NATURAL, YOU WIN!");
     
   }else{

     int point =a;
     int b=shoot(2,6);
     i++;
     System.out.println("roll " + i +": " +b);
     
     boolean end = false;
     
      while(end==false){
        
      if(point==b){
       System.out.println("YOU WIN!");
       end = true;
        
     }else if (b==7){
       System.out.println("YOU LOSE!");
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
  gameInstructions();
  for (int i=1; i<= Integer.parseInt(args[0]); i++){
    System.out.println("ROUND " +i);
    round();
    newLine();
    newLine();
    newLine();

}
  }
}
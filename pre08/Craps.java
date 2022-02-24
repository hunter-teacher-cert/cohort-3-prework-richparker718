import java.io.*;
import java.util.*;

public class Craps{


public static int roll(int a){

Random random = new Random();
int n= random.nextInt(a)+1;
 return n;

}

public static int shoot(int a, int b){

 int c =roll(b)+roll(b);
  return c;
  
}

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

  for (int i=1; i<= Integer.parseInt(args[0]); i++){
    System.out.println("Round " +i);
     round();
       System.out.println();

}
  }
}
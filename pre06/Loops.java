import java.io.*;
import java.util.*;


public class Loops{

  public static void power(int x, int n) {
    
    int base = x;
    
    if (n == 0) {

      System.out.println("1");

    } else {

      for (int i = 1; i < n; i = i + 1){
       x = x * base;

      }
    System.out.println(x);
    }
    }

    public static void factorial(int n) {
    
    
    int result = 1;
        
      for (int i = n; i > 1; i = i - 1) {
      
       result = n * (i-1);
       n = result;
      }
      System.out.println(result);
      
      } 
    
    

  public static void main(String[] args){
      power(3,3);
      factorial(7);
}
}
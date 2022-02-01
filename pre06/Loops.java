import java.io.*;
import java.util.*;


public class Loops{

  public static double power(double x, int n) {
    
    double base = x;
    
    if (n == 0) {

      return 1;

    } else {

      for (int i = 1; i < n; i = i + 1){
       x = x * base;

      }
      return x;
    }
    }

    public static int factorial(int n) {
    
    
    int result = 1;
        
      for (int i = n; i > 1; i = i - 1) {
      
       result = n * (i-1);
       n = result;
       
      }
      return result;
      }
    
    public static double myexp(double x, double n){
      double sum = 1;
      int i = 1;
      double e = i + x;

      for (i = 1; i <= n; i++){
        sum = e + Math.pow(x,i)/factorial(i);
      }
      return sum;
    }
  

  public static void main(String[] args){
      System.out.println(power(3,3));
      System.out.println(factorial(7));
      System.out.println(myexp(2,5));
}
}
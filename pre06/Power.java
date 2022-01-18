import java.io.*;
import java.util.*;


public class Power{

  public static void power(int x, int n) {
    
    int base = x;
    
    if (n == 0) {
      System.out.println("1");
    } else if (n == 1){
      System.out.println(x);
    } else {
      for (int i = 1; i < n; i = i + 1){
       x = x * base;
      }
    System.out.println(x);
    }
    }
  public static void main(String[] args){
      power(3,4);
}
}
import java.io.*;
import java.util.*;

public class Methods {

public static boolean isDivisible(int m, int n){
  return (m % n == 0);
}
public static boolean isTriangle(int a, int b, int c){
  return !(( a > b + c) || (b > a + c) || (c > a + b));
  }
   
  public static void main(String[] args)
  {
   System.out.println(isTriangle(2,3,30));
  
   System.out.println(isDivisible(24,12));
  }
  }
  
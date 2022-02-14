import java.io.*;
import java.util.*;

public class Array{

  public static double[] powArray(double[] a, double b){
    
  
    for(int i= 0; i<a.length; i++){
     
    System.out.print(Math.pow(a[i], 2.0) +" ");
    
}
    System.out.println();

    for(int i= 0; i<a.length; i++){
     
    System.out.print(Math.pow(a[i], b) +" ");
    
}
    return a;
    
}
 public static void main(String[] args){
 
 double[] a= {3.0,4.0,5.0,6.0,7.0};
 double b = 3.0;

 powArray(a,b);
 
} 
}
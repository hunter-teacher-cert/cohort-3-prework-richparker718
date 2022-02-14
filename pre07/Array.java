import java.io.*;
import java.util.*;

public class Array{

 
  public static double[] powArray(double[] a){
    
  
    for(int i= 0; i<a.length; i++){
    
    
    System.out.print(Math.pow(a[i], 2.0) +" ");
    
}
    
    return a;
    
}
 public static void main(String[] args){
 
 double[] a= {3.0,4.0,5.0,6.0,7.0};
 powArray(a);
 
}


  
}
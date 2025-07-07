
package javaapplication16;

import java.util.Scanner;


public class JavaApplication16 {

   
    public static void main(String[] args) {
       String fname;
      String lname;
      int age;
      
      Scanner scan= new Scanner (System.in);
      
      System.out.println("Input First Name: ");
      fname = scan.nextLine();
      
      System.out.println("Input Last Name:  ");
      lname = scan.nextLine();
      
      System.out.println("Input Age: ");
      age = scan.nextInt();
      
      SimpleConstructor sc = new SimpleConstructor(fname,lname,age);
      
      sc.displayInfo();
      
      
      
              
      
     
      
    }
    
    
        
} 
    



package studentadminission;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentManagementSystem {
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int choice;
        
        ArrayList<studentAdmission> admissionArrayList = new ArrayList<>();
        
        do { System.out.println("Menu");
             System.out.println("[1] Add Student");
             System.out.println("[2] Add Course");
             System.out.println("[3] Display Student List");
             System.out.println("[4] Display Course");
             System.out.println("[0] Exit");
             choice = scan.nextInt();
             scan.nextLine();
            
        
        
        
        
        switch (choice) {
            case 1: 
                System.out.println("Name: ");
                String stdName = scan.next();
                
                System.out.println("Age: ");
                int stdAge = scan.nextInt();
                
                System.out.println("Gender: ");
                String stdGender = scan.next();
                
                System.out.println("Grade Level: ");
                int stdGradeLevel = scan.nextInt();
                
            case 3: 
                
                break;
            default:
                
        }
     
        } while ( choice != 0);
    }
        
    }
    


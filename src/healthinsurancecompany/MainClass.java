/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthinsurancecompany;



import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ues
 */
public class MainClass {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       Date date = new Date();     
        

        //Object of Employed Class 
        Employed emp = new Employed();
        //Object of Private Class
        Private pri = new Private();
        
        
        System.out.println("------------------------------------------------------------------------------------------WELCOME TO SOW's HEALTH INSURANCE COMPANY----------------------------------------------------------------------------");
       
        
        System.out.println("1. Personnell Employed\n" +
                                        "2. Self-Employed"  );
        System.out.print("Select an option : ");
        int opt = input.nextInt();
        
        switch(opt)
        {
            case 1:
              System.out.println("-----------------------------------------------------------------------WELCOME TO PERSONELL EMPLOYED PAGE-------------------------------------------------------------------------------");
                    System.out.print("Enter Social Security Number : " );
                         String ssn = input.next();
                         emp.setSSN(ssn);
                    System.out.print("Enter your Name : " );
                          String name = input.next();
                          emp.setName(name);
                    System.out.print("Enter your date of birth : ");
                          LocalDate dobirth = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
                                         emp.setDOB(dobirth.toString());                 
                    LocalDate startdatee = LocalDate.now();
                                         emp.setStartDate(startdatee.toString());
                         LocalDate enddate = startdatee.plusYears(1);
                                          emp.setEndDate(enddate.toString());
                    System.out.print("Enter your Salary : " );
                          double s = input.nextDouble();
                          emp.setSalary(s);
               
                          System.out.println("----------------------------------------------------------------------Personel Employee Information------------------------------------------------------------------------");
                        System.out.println("The Social Security Number is : " + emp.getSSN());
                        System.out.println("The Name is : " + emp.getName());
                        System.out.println("The date of birth is : " + emp.getDOB());
                        System.out.println("The start date is : " + emp.getStartDate());
                        System.out.println("The end date is : " + emp.getEndDate());
                        if(enddate.isAfter(startdatee))
                        {
                            emp.setStatus(true);
                            System.out.println("Subscription status is : " + emp.getStatus() );
                        }else{
                        System.out.println("Subscription Status is : " + emp.getStatus());
                        }
                        System.out.println("Generated Cost is : " + emp.generateCost());
              break;
              case 2 :
                 System.out.println("-----------------------------------------------------------------------WELCOME TO SELF-EMPLOYED PAGE-------------------------------------------------------------------------------");
                         System.out.print("Enter Social Security Number : " );
                         String ssn1 = input.next();
                         pri.setSSN(ssn1);
                    System.out.print("Enter your Name : " );
                          String name1 = input.next();
                          pri.setName(name1);
                    System.out.print("Enter your date of birth : ");
                     LocalDate dobirth1 = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());
                                      pri.setDOB(dobirth1.toString());                 
                    LocalDate startdatee1 = LocalDate.now();
                           pri.setStartDate(startdatee1.toString());
                         LocalDate enddate1 = startdatee1.plusYears(1);
                          pri.setEndDate(enddate1.toString());
                   System.out.print("Enter the size : ");
                          int si = input.nextInt();
                          pri.setSize(si);
                          
                    System.out.println("----------------------------------------------------------------------Private Employee Information------------------------------------------------------------------------");
                            System.out.println("The Social Security Number is : " + pri.getSSN());
                            System.out.println("The Name is : " + pri.getName());
                            System.out.println("The date of birth is : " + pri.getDOB());
                            System.out.println("The start date is : " + pri.getStartDate());
                            System.out.println("The end date is : " + pri.getEndDate());
                           if(enddate1.isAfter(startdatee1))
                        {
                            emp.setStatus(true);
                            System.out.println("Subscription status is : " + emp.getStatus() );
                        } else
                           {
                        System.out.println("Subscription Status is : " + emp.getStatus());
                           }
                            System.out.println("The size of the family is : " + pri.getSize());
                            System.out.println("The total cost is : " + pri.generateCost());
          break;  
              default :
                  System.out.println("Incorrect Option, Please try again");

        }
        
    
    }
}

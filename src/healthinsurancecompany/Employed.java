/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthinsurancecompany;

/**
 *
 * @author ues
 */
//This class is inheriting the Company Class
public class Employed extends Company {
    
    //Encapsulation
    private double salary;
   
    //Constucted
    public Employed()
    {
        salary = 0.0;
       
    }
    
    //Polimorphishm (method overloading)
    public Employed(double salary)
    {
      //  super(SSN,name,DOB,startDate,endDate);
        this.salary = salary;
    }
    
    //Accessors and Mutators(Getters and Setters)
    public double getSalary()
    {
        return salary;
    }
    
     public void setSalary(double salary)
     {
        this.salary = salary;
     }
  
     //Polimorphism(Method Overriding)
    @Override
    public double generateCost() {
        double per;
        per = (salary * 0.70)/100;
        return per;
    }
}

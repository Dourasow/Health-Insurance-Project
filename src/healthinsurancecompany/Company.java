/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthinsurancecompany;

import java.util.Date;

/**
 *
 * @author ues
 */
//Class
public abstract class Company {
    
    //Encapsulation
    private String SSN;
    private  String name;
    private String DOB;
    private String startDate;
    private String endDate;
    private boolean status;
    
    //Constructor
    public Company()
    {
        SSN = " ";
        name = " ";
        DOB = " ";
        startDate = " ";
        endDate = " ";
        status = false;
    }
    
    //Polimorphism ( Method Overloading)
    public Company(String SSN, String name, String DOB, String startDate, String endDate, boolean status)
    {
        this.SSN = SSN;
        this.name = name;
        this.DOB = DOB;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }
    
    //Accessors and Mutators(Getters and Setters)
    public String getSSN()
    {
        return SSN;
    }
    public void setSSN(String SSN)
    {
        this.SSN = SSN;
    }
    
      public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
      public String getDOB()
    {
        return DOB;
    }
    public void setDOB(String DOB)
    {
        this.DOB = DOB;
    }
    
      public String getStartDate()
    {
        return startDate;
    }
    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }
    
      public String getEndDate()
    {
        return endDate;
    }
    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }
    
    public boolean getStatus()
    {
        return status;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }
    //Abstract Method
    public abstract double generateCost();
}

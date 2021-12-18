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
//This class is inheriting the Company class
public class Private extends Company{
    
    int size;

    //Constructor
    public Private()
    {
        size = 0;
    }
    //Polimorphism(Method Overloading)
    public Private(int size)
    {
        this.size = size;
    }
    
    //Accessor and Mutators(Getters and Setters)
 
       public int getSize()
    {
        return size;
    }
    
    public void setSize(int size)
    {
        this.size = size;
    }
    
//Polimorphism (Method Overriding)
    @Override
    public double generateCost() {
         int pay;
        pay = size * 3000;
        return pay;
    }
    
}

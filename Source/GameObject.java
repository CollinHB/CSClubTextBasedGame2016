/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csclub2016game;

/**
 * CS Club Fall 2016 Project
 * Class:
 * Description:
 * Notes: This class is the super class for most of the objects in the game's 
 * world, and as such is required in order for the game to function
 * @author(s) Zachary Kirchens
 */
public class GameObject 
{
    //Variables-----------------------------------------------------------------
    //Private:
    private double locationX;
    private double locationY;
    private String name;
    
    
    //Constructors--------------------------------------------------------------
    public GameObject()
    {/*Default Constructor: This Constructor sets a few default values for the 
        3 variables. 
        This is done by calling the mutator methods: 
        variable "locationX" is set to 0.0
        variable "locationY" is set to 0.0
        variable "name" is set to "Default"*/
        this.setLocX(0.0);
        this.setLocY(0.0);
        this.setName("Default");
    }
    public GameObject(double dLocX, double dLocY, String sName)
    {/*Advanced Constructor: This Constructor takes 3 arguments to set the 
        values for the 3 variables.
        This is done by calling the mutator methods: 
        variable "locationX" is set to argument "dLocX", which is of type double
        variable "locationY" is set to argument "dLocY", which is of type double
        variable "name" is set to argument "sName", which is of type String*/
        this.setLocX(dLocX);
        this.setLocY(dLocY);
        this.setName(sName);
    }
    
    
    //Mutators------------------------------------------------------------------
    public void setLocX(double dLocX)
    {/*The "setLocX" Method: This method takes a double argument, "dLocX", which
        is then applied to the "locationX" variable*/
        locationX=dLocX;
    }
    public void setLocY(double dLocY)
    {/*The "setLocY" Method: This method takes a double argument, "dLocY", which
        is then applied to the "locationY" variable*/
        locationY=dLocY;
    }
    public void setName(String sName)
    {/*The "setName" Method: This method takes a String argument, "sName", which
        is then applied to the "name" variable*/
        name=sName;
    }
    
    
    //Accessors-----------------------------------------------------------------
    public double getLocX()
    {/*The "getLocX" Method: This method returns the value of the "locationX" 
        variable, which is of type double*/
        return locationX;
    }
    public double getLocY()
    {/*The "getLocY" Method: This method returns the value of the "locationY" 
        variable, which is of type double*/
        return locationY;
    }
    public String getName()
    {/*The "getName" Method: This method returns the value of the "name" 
        variable, which is of type String*/
        return name;
    }
}

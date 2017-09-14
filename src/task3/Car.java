/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Nick
 */
public interface Car {
    
    public abstract void getCarLook(); 
    
    public abstract String getCarColor();

    public abstract void setCarColor(String carColor);

    public abstract String getNumberOfSeats();

    public abstract void setNumberOfSeats(String numberOfSeats);
}

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
public class Toyota {
    private String carColor;
    private String numberOfSeats;
    
    private String heightInInches;
    private String WidthInInches;
    
   
    public void getCarLook() {
        System.out.println("Basic car with Toyota Logo"); 
    }

    public String getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(String heightInInches) {
        this.heightInInches = heightInInches;
    }

    public String getWidthInInches() {
        return WidthInInches;
    }

    public void setWidthInInches(String WidthInInches) {
        this.WidthInInches = WidthInInches;
    }

    //
    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    
    
}

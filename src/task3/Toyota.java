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
    private String widthInInches;
    
   
    public void getCarLook() {
        System.out.println("Basic car with Toyota Logo"); 
    }

    public String getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(String heightInInches) {
        if(heightInInches == null || heightInInches.isEmpty()) {
            throw new IllegalArgumentException("Heigh is required");
        }
        this.heightInInches = heightInInches;
    }

    public String getWidthInInches() {
        return widthInInches;
    }

    public void setWidthInInches(String widthInInches) {
        if(widthInInches == null || widthInInches.isEmpty()) {
            throw new IllegalArgumentException("Width is required");
        }
        this.widthInInches = widthInInches;
    }

    //
    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        if(carColor == null || carColor.isEmpty()) {
            throw new IllegalArgumentException("color is required");
        }
        this.carColor = carColor;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        if(numberOfSeats == null || numberOfSeats.isEmpty()) {
            throw new IllegalArgumentException("Number Of seats required");
        }
        this.numberOfSeats = numberOfSeats;
    }
    
    
}

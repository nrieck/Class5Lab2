/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Nick
 */
public class Car {
    
    private String carColor;
    private String numberOfSeats;

    //This gets the car's look at will change while going through the classes
    public void getCarLook() {
        System.out.println("no look"); // Default look car isn't any type so it doesn't exist yet
    }
    
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

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
public class Toyota extends Car {
    
    private String heightInInches;
    private String widthInInches;
    
    @Override
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

    public void setWidthInInches(String WidthInInches) {
        if(widthInInches == null || widthInInches.isEmpty()) {
            throw new IllegalArgumentException("Width is required");
        }
        this.widthInInches = WidthInInches;
    }
    
    
}

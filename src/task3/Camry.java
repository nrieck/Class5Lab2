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
public class Camry extends Toyota{
    @Override
    public void getCarLook() {
        System.out.println("Car is a Toyota Camry with a Toyota logo on the back."); // Default look car isn't any type so it doesn't exist yet
    }
    
    public void insertCamryLogo() {
        System.out.println("Inserting Camry logo");
    }
}

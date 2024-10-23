/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpletrafficlightsystem;

class Place {
    String name; // Name of the traffic light color (Red, Orange, Green)
    int tokens;  // Number of tokens (1 = Light is ON, 0 = Light is OFF)

    public Place(String name, int tokens) {
        this.name = name;  // Set the traffic light color
        this.tokens = tokens;  // Set the token (1 if ON, 0 if OFF)
    }

    // Add a token (turn this light color ON)
    public void addToken() {
        tokens++;
    }

    // Remove a token (turn this light color OFF)
    public void removeToken() {
        if (tokens > 0) {
            tokens--;
        }
    }

    // Check if this color is ON (does it have a token?)
    public boolean hasTokens() {
        return tokens > 0;
    }
}

// Transition class represents switching from one traffic light color to another
class Transition {
    String name;       // Name of the transition (e.g., "Red to Orange")
    Place inputPlace;  // Current color
    Place outputPlace; // Next color

    public Transition(String name, Place inputPlace, Place outputPlace) {
        this.name = name;
        this.inputPlace = inputPlace;
        this.outputPlace = outputPlace;
    }

    // Check if the transition can happen (is the current light color ON?)
    public boolean canFire() {
        return inputPlace.hasTokens();
    }

    // Perform the transition (change the light's color)
    public void fire() {
        if (canFire()) {
            inputPlace.removeToken(); // Turn OFF the current color
            outputPlace.addToken();   // Turn ON the next color
            System.out.println("Transition " + name + " fired.");
        } else {
            System.out.println("Transition " + name + " cannot fire.");
        }
    }
}


public class SimpleTrafficLightSystem {
    public static void main(String[] args) {
        Place red = new Place("Red Light", 1); 
        Place orange = new Place("Orange Light", 0);  
        Place green = new Place("Green Light", 0);  

       
        Transition redToOrange = new Transition("Red to Orange", red, orange);
        Transition orangeToGreen = new Transition("Orange to Green", orange, green);
        Transition greenToRed = new Transition("Green to Red", green, red);

        
        System.out.println("Initial State: Red = " + red.tokens + ", Orange = " + orange.tokens + ", Green = " + green.tokens);

        //Try to turn the light ON
        redToOrange.fire();
        System.out.println("State after Red to Orange: Red = " + red.tokens + ", Orange = " + orange.tokens + ", Green = " + green.tokens);

        
        orangeToGreen.fire();
        System.out.println("State after Orange to Green: Red = " + red.tokens + ", Orange = " + orange.tokens + ", Green = " + green.tokens);

        
        greenToRed.fire();
        System.out.println("State after Green to Red: Red = " + red.tokens + ", Orange = " + orange.tokens + ", Green = " + green.tokens);
    
    }
    
}

# Simple Traffic Light System

## Description

The **Simple Traffic Light System** is a Java application that simulates a basic traffic light mechanism using an object-oriented approach. This project illustrates the principles of state transitions between different traffic light colors: red, orange, and green.

## Features

- **Traffic Light Simulation**: The system can switch between three states (red, orange, and green) based on user-defined transitions.
- **Token-Based Control**: Each traffic light color is represented by a token system, where a token indicates that the light is ON, and the absence of a token indicates it is OFF.
- **Transition Management**: The program handles the transitions between lights and checks whether the transition can occur based on the current light state.

## How It Works

1. **Place Class**: Represents each traffic light color with a name and a token count.
2. **Transition Class**: Manages the logic of switching from one light to another, ensuring that transitions only occur if the current light is ON.
3. **Main Class**: Initializes the traffic lights and demonstrates the transitions through console output.

## Getting Started

To run the application:

1. Clone the repository:
   ```bash
   git clone https://github.com/fatherrahmaneghoul/Simple-Traffic-Light-System.git
   ```
2. Navigate to the project directory:
   ```bash
   cd simple-traffic-light-system
   ```
3. Compile the Java files:
   ```bash
   javac SimpleTrafficLightSystem.java
   ```
4. Execute the main class to see the traffic light transitions:
   ```bash
   java SimpleTrafficLightSystem
   ```

## Future Enhancements

- Implement a graphical user interface (GUI) to visualize the traffic light changes.
- Add timing controls to simulate real traffic light durations.
- Enhance the system with additional features such as pedestrian signals.

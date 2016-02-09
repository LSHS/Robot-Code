package org.usfirst.frc.team4459.robot;
import org.usfirst.frc.team4459.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
	public Joystick stickLeft;
	public Joystick stickRight;
	public Button rTrigger;
	public Button rButton2;
	public Button rButton3;
	public Button lTrigger;
	
	public OI () {
		stickLeft = new Joystick(RobotMap.leftJoystick);
		stickRight = new Joystick(RobotMap.rightJoystick);
		rTrigger = new JoystickButton(stickRight, 1);
		rButton2 = new JoystickButton(stickRight, 2);
		rButton3 = new JoystickButton(stickRight, 3);
		lTrigger = new JoystickButton(stickLeft, 1);
		
		//SetMaxMotorOutput
		rButton2.whenPressed(new SetMaxMotorOutput());
       
		//FireLauncher
		lTrigger.whenPressed(new FireLauncher());
		

	}
			
}
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command 
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());




package org.usfirst.frc.team4459.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team4459.robot.commands.ExampleCommand;
import org.usfirst.frc.team4459.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team4459.robot.subsystems.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();

	public static final DriveTrain DriveTrain = new DriveTrain();
	
	public static final LauncherWheels launcherWheels = new LauncherWheels();
	
	public static OI oi;
	
Ultrasonic sonic1;	

	

int autoLoopCounter;

    Command autonomousCommand;
    SendableChooser chooser;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        chooser = new SendableChooser();
        chooser.addDefault("Default Auto", new ExampleCommand());
//        chooser.addObject("My Auto", new MyfAutoCommand());
        SmartDashboard.putData("Auto mode", chooser);
        
        //Drive
        //this.DriveTrain = new DriveTrain();
       	//RobotMap.robotDrive1.arcadeDrive(oi.stickLeft);
              
        //Buttons
       // oi.button1.whenPressed(new SetMaxMotorOutput());
        
        //Ultrasonic
        sonic1 = new Ultrasonic(0,1);
        sonic1.setAutomaticMode(true);
        
    }


	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
        //autonomousCommand = (Command) chooser.getSelected();
        autoLoopCounter = 0; //This resets the loop counter to 0
        //if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        //Scheduler.getInstance().run();
      /**  if(autoLoopCounter < 100) { //Checks to see if the counter has reached 100 yet
           myRobot.drive(-0.5, 0.0);  //If the robot hasn't reached 100 packets yet, the robot is set to drive forward at half speed, the next line increments the counter by 1
           autoLoopCounter++;
       } else {
            myRobot.drive(0.0, 0.0); //If the robot has reached 100 packets, this line tells the robot to stop
       }*/
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        //if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	//getInstance().run();;
    	//RobotMap.robotDrive1.arcadeDrive(oi.stickRight); //This line drives the robot using the values of the joystick and the motor controllers selected above
    	Scheduler.getInstance().run();
	
     }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}

package org.usfirst.frc.team4459.robot.subsystems;

import org.usfirst.frc.team4459.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team4459.robot.commands.DriveWithJoysticks;

/**
 *
 */
public class DriveTrain extends Subsystem {
    RobotDrive robotDrive1 = RobotMap.robotDrive1;
    private boolean bFullSpeed = true;
    
    public void takeJoystickInputs (Joystick right){
    	robotDrive1.arcadeDrive(right);
    }
    public void stop(){
    	robotDrive1.drive(0,0);
    }
    public void reduceMotorSpeed (){
    	
    	if (bFullSpeed)
    		robotDrive1.setMaxOutput(.5);
    	else
     		robotDrive1.setMaxOutput(1);
    	   
    	bFullSpeed = !bFullSpeed;
    	SmartDashboard.putData("DriveWithJoysticks", new DriveWithJoysticks());
    }
    
    //Put methods for controlling this subsystem
    //here. Call these from Commands.
    public DriveTrain(){
    	
    	//RobotMap.robotDrive1 = new RobotDrive(RobotMap.leftMotor,RobotMap.rightMotor);
    	robotDrive1 = RobotMap.robotDrive1;
    	
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveWithJoysticks());
    }
}



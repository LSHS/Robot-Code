package org.usfirst.frc.team4459.robot.subsystems;

import org.usfirst.frc.team4459.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4459.robot.commands.FireLauncher;
import edu.wpi.first.wpilibj.*;



/**
 *
 */
public class LauncherWheels extends Subsystem {
    RobotDrive robotFire = RobotMap.robotFire;
    Victor lLaunchMotor = new Victor(RobotMap.lLaunchMotor);
    Victor rLaunchMotor = new Victor(RobotMap.rLaunchMotor);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void fireLauncher(){
    	lLaunchMotor.setInverted(true);
    	
    	lLaunchMotor.set(1);
    	rLaunchMotor.set(1);
    }
    
    public void suckBalls(){
    	
    }
    
    public LauncherWheels(){
    	RobotMap.robotFire = new RobotDrive(RobotMap.lLaunchMotor,RobotMap.rLaunchMotor);
    	robotFire = RobotMap.robotFire;
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new FireLauncher());
    }
}

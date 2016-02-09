package org.usfirst.frc.team4459.robot.commands;

import org.usfirst.frc.team4459.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SetMaxMotorOutput extends Command {
	
	public SetMaxMotorOutput(){
		super("setMaxMotorOutput");
		requires(Robot.DriveTrain);
	}
	protected void initialize(){
		
	}
	protected void execute(){
		Robot.DriveTrain.reduceMotorSpeed();
		
	}
	protected boolean isFinished(){
		return true;
	}
	protected void end(){
	//	Robot.DriveTrain.resetMotorSpeed();
	}
	protected void interrupted(){
		
	}
}

package org.usfirst.frc.team2907.robot.commands;

import org.usfirst.frc.team2907.robot.OI;
import org.usfirst.frc.team2907.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorControl extends Command {

    public ElevatorControl() {
    	requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		if(Math.abs(OI.oiJoy.getRawAxis(1)) > .05) 
		{
			Robot.elevator.setElevSpeed(-1 * OI.oiJoy.getRawAxis(1));
		}
		
		else 
		{
			Robot.elevator.setElevSpeed(0);
		}	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

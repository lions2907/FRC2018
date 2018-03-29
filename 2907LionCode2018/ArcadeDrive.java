package org.usfirst.frc.team2907.robot.commands;

import org.usfirst.frc.team2907.robot.Robot;
import org.usfirst.frc.team2907.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArcadeDrive extends Command {

    public ArcadeDrive()
    {
       requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
		if(Math.abs(OI.driveJoy.getRawAxis(1)) > .05 || Math.abs(OI.driveJoy.getRawAxis(4))  > .05)
		{
			Robot.driveTrain.arcadeDrive(1 * OI.driveJoy.getRawAxis(1), -1 * OI.driveJoy.getRawAxis(4));
		}
		else
		{
			Robot.driveTrain.arcadeDrive(0, 0);
		}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
    	
    }
}

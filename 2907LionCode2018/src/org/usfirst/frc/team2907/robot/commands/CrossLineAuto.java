package org.usfirst.frc.team2907.robot.commands;

import org.usfirst.frc.team2907.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CrossLineAuto extends Command {
	
	Timer timer;

    public CrossLineAuto() {
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	timer = new Timer();
    	timer.reset();
    	timer.start();
    	Robot.shifter.shiftDown();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if(timer.get() < 2.5) {
    		Robot.driveTrain.driveL(-0.75);
    		Robot.driveTrain.driveR(-0.75);
    	} else {
    		Robot.driveTrain.driveL(0);
    		Robot.driveTrain.driveR(0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
   		Robot.driveTrain.driveL(0);
		Robot.driveTrain.driveR(0);
    	timer.stop();
    	timer.reset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}

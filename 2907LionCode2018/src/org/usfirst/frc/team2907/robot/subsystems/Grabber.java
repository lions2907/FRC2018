package org.usfirst.frc.team2907.robot.subsystems;

import org.usfirst.frc.team2907.robot.RobotMap;
import org.usfirst.frc.team2907.robot.commands.ElevatorControl;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Grabber extends Subsystem {

	private DoubleSolenoid grabber = RobotMap.grabber;
	
	public void grabberOpen() {
		grabber.set(DoubleSolenoid.Value.kForward);
	}
	
	public void grabberClose() {
		grabber.set(DoubleSolenoid.Value.kReverse);
	}

    public void initDefaultCommand() {
    
    }
}


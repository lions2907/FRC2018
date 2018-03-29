package org.usfirst.frc.team2907.robot.subsystems;

import org.usfirst.frc.team2907.robot.RobotMap;
import org.usfirst.frc.team2907.robot.commands.IntakeControl;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {

	public TalonSRX LIntake = RobotMap.LIntake;
	public TalonSRX RIntake = RobotMap.RIntake;
	
	public	Intake()
	{
		LIntake.setInverted(true);
		RIntake.setInverted(false);
	}
	
	public void setIntakeSpeed(double speed)
	{
		LIntake.set(ControlMode.PercentOutput, speed);
		RIntake.set(ControlMode.PercentOutput, speed * 0.8);
	}

	
	
    public void initDefaultCommand() 
    {
       setDefaultCommand( new IntakeControl());
    }
}


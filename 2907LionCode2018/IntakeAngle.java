package org.usfirst.frc.team2907.robot.subsystems;

import org.usfirst.frc.team2907.robot.RobotMap;
import org.usfirst.frc.team2907.robot.commands.IntakeAngleControl;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeAngle extends Subsystem {

	public TalonSRX InAngle = RobotMap.Intakeangle;
	DigitalInput limswitch = RobotMap.limswitch;
	public	IntakeAngle()
	{
		InAngle.setInverted(false);
	}
	
	public void setAngleSpeed(double speed)
	{
		InAngle.set(ControlMode.PercentOutput, speed);
	}

	
	
    public void initDefaultCommand() 
    {
       setDefaultCommand(new IntakeAngleControl());
    }

	public void turnUp(double d) {
		while(!isUp())
		{
			setAngleSpeed(1);
		}
		setAngleSpeed(0);
	}

	public boolean isUp() {
		return limswitch.get();
	}
}


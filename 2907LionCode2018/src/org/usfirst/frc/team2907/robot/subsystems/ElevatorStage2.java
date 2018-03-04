package org.usfirst.frc.team2907.robot.subsystems;

import org.usfirst.frc.team2907.robot.RobotMap;
import org.usfirst.frc.team2907.robot.commands.ElevatorControl;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ElevatorStage2 extends Subsystem {

	public TalonSRX elevatorMotor = RobotMap.liftMotor;
	
	public void elevUp(double speed) {
		elevatorMotor.set(ControlMode.PercentOutput, speed);
	}
	
	public void elevDown(double speed) {
		elevatorMotor.set(ControlMode.PercentOutput, speed);
	}

    public void initDefaultCommand() {
       setDefaultCommand( new ElevatorControl());
    }
}


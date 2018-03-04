package org.usfirst.frc.team2907.robot.subsystems;

import org.usfirst.frc.team2907.robot.RobotMap;
import org.usfirst.frc.team2907.robot.commands.JoystickTankDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

	public TalonSRX rightMaster = RobotMap.rightMaster;
	private TalonSRX rightSlave1 = RobotMap.rightSlave1;
	private TalonSRX rightSlave2 = RobotMap.rightSlave2;

	public TalonSRX leftMaster = RobotMap.leftMaster;
	private TalonSRX leftSlave1 = RobotMap.leftSlave1;
	private TalonSRX leftSlave2 = RobotMap.leftSlave2;
	
	public Drivetrain() {
		
		rightSlave1.follow(rightMaster);
		rightSlave2.follow(rightMaster);
		leftSlave1.follow(leftMaster);
		leftSlave2.follow(leftMaster);
		
		leftMaster.setInverted(false);
		leftSlave1.setInverted(false);
		leftSlave2.setInverted(false);
		
		rightMaster.setInverted(true);
		rightSlave1.setInverted(true);
		rightSlave2.setInverted(true);
		
	}
	
	public void driveR(double RMotor) {
		rightMaster.set(ControlMode.PercentOutput, RMotor);
	}
	public void driveL(double LMotor){
		leftMaster.set(ControlMode.PercentOutput, LMotor);
	}

    public void initDefaultCommand() {

    	setDefaultCommand(new JoystickTankDrive());    	
    	
    }
}


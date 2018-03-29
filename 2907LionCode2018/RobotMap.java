/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2907.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static Compressor compressor = new Compressor();
	
	public static TalonSRX rightMaster = new TalonSRX(1);
	public static TalonSRX rightSlave1 = new TalonSRX(4);
	public static TalonSRX rightSlave2 = new TalonSRX(2);
	
	public static TalonSRX leftMaster = new TalonSRX(6);
	public static TalonSRX leftSlave1 = new TalonSRX(5);
	public static TalonSRX leftSlave2 = new TalonSRX(3);
	
	public static TalonSRX liftMotor = new TalonSRX(7);
	public static TalonSRX LIntake = new TalonSRX(10);
	public static TalonSRX RIntake = new TalonSRX(8);
	public static TalonSRX Intakeangle = new TalonSRX(11);
	public static DigitalInput limswitch = new DigitalInput(4);
	
	public static Encoder driveEncoderLeft = new Encoder(0, 1);
	public static Encoder driveEncoderRight = new Encoder(2, 3);
	
	public static DoubleSolenoid shifter = new DoubleSolenoid(3, 2);
	
	public static DoubleSolenoid elevatorShaft = new DoubleSolenoid(1, 0);
}

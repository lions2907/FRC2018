package org.usfirst.frc.team2907.robot.subsystems;
import org.usfirst.frc.team2907.robot.RobotMap;
import org.usfirst.frc.team2907.robot.commands.ArcadeDrive;
//import org.usfirst.frc.team2907.robot.commands.JoystickTankDrive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;

import com.kauailabs.navx.frc.AHRS;
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
	
	public Encoder driveEncoderLeft = RobotMap.driveEncoderLeft;
	public Encoder driveEncoderRight = RobotMap.driveEncoderRight;
	
	private AHRS sensorBoard;
	private boolean navigationAvaliable;

	public Drivetrain() {
		
		rightSlave1.follow(rightMaster);
		rightSlave2.follow(rightMaster);
		leftSlave1.follow(leftMaster);
		leftSlave2.follow(leftMaster);
		
		leftMaster.setInverted(false);
		leftMaster.configOpenloopRamp(0.25, 0);
		leftSlave1.setInverted(false);
		leftSlave2.setInverted(false);
		
		rightMaster.setInverted(true);
		rightMaster.configOpenloopRamp(0.25, 0);
		rightSlave1.setInverted(true);
		rightSlave2.setInverted(true);
		
		rightMaster.setNeutralMode(NeutralMode.Brake);
		rightSlave1.setNeutralMode(NeutralMode.Brake);
		rightSlave2.setNeutralMode(NeutralMode.Brake);
		
		leftMaster.setNeutralMode(NeutralMode.Brake);
		leftSlave1.setNeutralMode(NeutralMode.Brake);
		leftSlave2.setNeutralMode(NeutralMode.Brake);
		try {
			/* init navigation board */
			sensorBoard = new AHRS(SPI.Port.kMXP);
			getSensorBoard().reset();
			navigationAvaliable = true;
		} 
		catch (Exception e) {
			System.out.println("Error instantating sensorBoard : " + e.getMessage());
		}
	}
	
	public void driveR(double RMotor)
	{
		rightMaster.set(ControlMode.PercentOutput, RMotor);
	}

	public void driveL(double LMotor)
	{
		leftMaster.set(ControlMode.PercentOutput, LMotor);
	}
	
	public void arcadeDrive(double speed, double turn)
	{
		double rightSpeed = speed - turn;
		double leftSpeed  = speed + turn;
		driveR(rightSpeed);
		driveL(leftSpeed);
	}
	
    public void initDefaultCommand() 
    {
    	setDefaultCommand(new ArcadeDrive());    	
    }
    
    public boolean isNavigationAvaliable() {
		return navigationAvaliable;
	}

	public AHRS getSensorBoard() {
		return sensorBoard;
	}
	
	public double getLinearAccelY()
	{
		return sensorBoard.getWorldLinearAccelX();
	}
	
	public double getLinearAccelX()
	{
		return sensorBoard.getWorldLinearAccelY();
	}
	
	public double getLeftDistance()
	{
		return driveEncoderLeft.getDistance();
	}
	
	public double getRightDistance()
	{
		return driveEncoderRight.getDistance();
	}
	
	public double getDistance()
	{
		return -(driveEncoderLeft.getDistance() + driveEncoderRight.getDistance()) / 2.0;
	}
	
	public void resetDistance()
	{
		driveEncoderLeft.reset();
		driveEncoderRight.reset();
	}
	
	public double getAngle()
	{
		return sensorBoard.getAngle();
	}   
}
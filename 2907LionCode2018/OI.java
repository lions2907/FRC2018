/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2907.robot;

import org.usfirst.frc.team2907.robot.commands.ShaftDown;
import org.usfirst.frc.team2907.robot.commands.ShaftUp;
import org.usfirst.frc.team2907.robot.commands.ShiftDown;
import org.usfirst.frc.team2907.robot.commands.ShiftUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	public static Joystick driveJoy = new Joystick(0);
	public static Joystick oiJoy = new Joystick(1);
	
	public static Button shiftDown = new JoystickButton(driveJoy, 5);
	public static Button shiftUp = new JoystickButton(driveJoy, 6); 
	
	public static Button shaftDown = new JoystickButton(oiJoy, 3);
	public static Button shaftUp = new JoystickButton(oiJoy, 1);
	
	
	public OI() 
	{
		shiftUp.whenPressed(new ShiftUp());
		shiftDown.whenPressed(new ShiftDown());
		
		shaftUp.whenPressed(new ShaftUp());
		shaftDown.whenPressed(new ShaftDown());
	}
	
}

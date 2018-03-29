package org.usfirst.frc.team2907.robot.subsystems;

import org.usfirst.frc.team2907.robot.Robot;
import org.usfirst.frc.team2907.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ElevatorStage1 extends Subsystem {

	private DoubleSolenoid elevatorShaft = RobotMap.elevatorShaft;
	
	public void shaftUp() 
	{
		if(!Robot.angle.isUp())
		{
			Robot.angle.turnUp(0.1);
		}
		elevatorShaft.set(DoubleSolenoid.Value.kForward);
	}
	
	public void shaftDown() 
	{
		if(!Robot.angle.isUp())
		{
			Robot.angle.turnUp(0.1);
		}
		elevatorShaft.set(DoubleSolenoid.Value.kReverse);
	}

    public void initDefaultCommand() {
//         Set the default command for a subsystem here.
//        setDefaultCommand(new MySpecialCommand());
    }
}

package org.usfirst.frc.team2907.robot.subsystems;

import org.usfirst.frc.team2907.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ElevatorStage1 extends Subsystem {

	private DoubleSolenoid elevatorShaft = RobotMap.elevatorShaft;
	
	public void shaftUp() {
		elevatorShaft.set(DoubleSolenoid.Value.kForward);
	}
	
	public void shaftDown() {
		elevatorShaft.set(DoubleSolenoid.Value.kReverse);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


package org.usfirst.frc.team2642.robot.subsystems;

import org.usfirst.frc.team2642.robot.Robot;
import org.usfirst.frc.team2642.robot.commands.DriveTrainMoveBackAndForth;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	Spark m_frontLeft = new Spark(1);
	   Spark m_rearLeft = new Spark(2);
	   SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

	   Spark m_frontRight = new Spark(3);
	   Spark m_rearRight = new Spark(4);
	   SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

	   DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);

	

	 
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveTrainMoveBackAndForth());
    }
    public void arcadeDrive(double xSpeed,
            double zRotation) {
    	arcadeDrive(1, 1);
    	
    }
    public void drive(double moveValue, double rotateValue)
    {
    	arcadeDrive(1, 1);
    //	robotDrive.arcadeDrive(moveValue, rotateValue);
    	
    }
    
    public void stop() 
    {
      	Robot.driveSubsystem.stop();
    }
}


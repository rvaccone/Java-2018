package org.usfirst.frc.team486.robot.commands;

import org.usfirst.frc.team486.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class VaultPush extends Command {

    public VaultPush() {
        requires(Robot.compressor);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.compressor.vault_extend();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    	/** if(Robot.m_oi.lvault_push.get()) {
            
    		return true;
    	}
        return false;
        */
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

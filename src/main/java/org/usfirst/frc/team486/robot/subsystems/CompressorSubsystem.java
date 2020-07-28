package org.usfirst.frc.team486.robot.subsystems;

import org.usfirst.frc.team486.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CompressorSubsystem extends Subsystem {
	
	//Compressor
	private Compressor compressor = new Compressor(RobotMap.compressor);
	//Solenoids
	private Solenoid grab = new Solenoid(RobotMap.grab_solenoid);
	private Solenoid arm = new Solenoid(RobotMap.extend_solenoid);
	private Solenoid vault = new Solenoid(RobotMap.vault_solenoid);
	private Solenoid sole_1 = new Solenoid(RobotMap.push);
	private Solenoid sole_2 = new Solenoid(RobotMap.push2);
	
	//Compressor
	public void compressor_start () {
		this.compressor.start();
	}
	//Grab
	public void grab_open() {
		this.grab.set(true);
	}
	public void grab_close() {
		this.grab.set(false);
	}
	//Arm
	public void arm_extend() {
		this.arm.set(true);
	}
	public void arm_decline() {
		this.arm.set(false);
	}
	//Vault
	public void vault_extend() {
		this.vault.set(true);
	}
	public void vault_retract() {
		this.vault.set(false);
	}
	public void sole_1_extent(){
		this.sole_1.set(true);
	}
	public void sole_1_retract(){
		this.sole_1.set(false);
	}
	public void sole_2_extent(){
		this.sole_2.set(true);
	}
	public void sole_2_retract(){
		this.sole_2.set(false);
	}
    public void initDefaultCommand() {
    }
}


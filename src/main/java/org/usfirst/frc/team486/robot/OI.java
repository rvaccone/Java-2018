/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team486.robot;

import org.usfirst.frc.team486.robot.commands.GrabClose;
import org.usfirst.frc.team486.robot.commands.WinchDown;
import org.usfirst.frc.team486.robot.commands.WinchUp;
import org.usfirst.frc.team486.robot.commands.ArmCommand;
import org.usfirst.frc.team486.robot.commands.ArmDecline;
import org.usfirst.frc.team486.robot.commands.ArmExtend;
import org.usfirst.frc.team486.robot.commands.GrabOpen;
import org.usfirst.frc.team486.robot.commands.VaultPush;
import org.usfirst.frc.team486.robot.commands.VaultRetract;
import org.usfirst.frc.team486.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//Joysticks
	public Joystick left_stick = new Joystick(RobotMap.left_stick);
	public Joystick right_stick = new Joystick(RobotMap.right_stick);
	public Joystick opstick = new Joystick(RobotMap.opstick);
	public Joystick station_stick = new Joystick(RobotMap.station_stick);
	//Opstick Buttons
	public JoystickButton grab_close = new JoystickButton(opstick,RobotMap.grab_close);
	public JoystickButton grab_open = new JoystickButton(opstick,RobotMap.grab_open);
	public JoystickButton arm_extend = new JoystickButton(opstick, RobotMap.arm_extend);
	public JoystickButton arm_decline = new JoystickButton(opstick, RobotMap.arm_decline);
	public JoystickButton sole1_extend = new JoystickButton(opstick, RobotMap.front_stinger1);
	public JoystickButton sole1_retract = new JoystickButton(opstick, RobotMap.front_stinger2);
	public JoystickButton test1 = new JoystickButton(opstick, RobotMap.push1);
	public JoystickButton test2 = new JoystickButton(opstick, RobotMap.push2);
	//Driver buttons
	public JoystickButton lvault_push = new JoystickButton(left_stick, RobotMap.vault_button);
	public JoystickButton rvault_push = new JoystickButton(right_stick, RobotMap.vault_button);
	//Station Buttons
	public JoystickButton winch_up = new JoystickButton(station_stick, RobotMap.winch_up);
	public JoystickButton winch_down = new JoystickButton(station_stick, RobotMap.winch_down);
	
	public OI() {
		grab_close.whenPressed(new VaultRetract());
		grab_open.whenPressed(new VaultPush());
		arm_extend.whenPressed(new ArmExtend());
		arm_decline.whenPressed(new ArmDecline());
		winch_up.whileHeld(new WinchUp());
		winch_down.whileHeld(new WinchDown());
		lvault_push.whenPressed(new GrabOpen());
		rvault_push.whenPressed(new GrabClose());
		sole1_extend.whenPressed(new Sole1Extend());
		sole1_retract.whenPressed(new Sole1Retract());
		test1.whenPressed(new Sole1Extend());
		test2.whenPressed(new Sole1Retract());
	}

	
}
package org.usfirst.frc.team1700.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.BaseMotorController;

public class Drive {
	public BaseMotorController leftFront;
	public BaseMotorController leftBack;
	public BaseMotorController rightFront;
	public BaseMotorController rightBack;
	
	public Drive (BaseMotorController leftFront, BaseMotorController leftBack, BaseMotorController rightFront, BaseMotorController rightBack) {
		this.leftFront = leftFront;
		this.leftBack = leftBack;
		this.rightFront = rightFront;
		this.rightBack = rightBack;
	}
	public void goForward (double speed) {
		leftFront.set(ControlMode.PercentOutput, speed);
		rightFront.set(ControlMode.PercentOutput, speed);
		leftBack.set(ControlMode.PercentOutput, speed);
		rightFront.set(ControlMode.PercentOutput, speed);
	}
}
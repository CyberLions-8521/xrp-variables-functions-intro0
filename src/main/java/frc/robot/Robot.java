// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.util.KeyboardController;
import frc.robot.util.XRPDrivetrain;

public class Robot extends TimedRobot {
  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {
    // TODO: Replace this code or delete it altogether for the training
    driveForward();
    
    stop();

    driveReverse();

    drive(0.0, 0.5);
  }







































  // TODO: Add more functions as needed
  private void drive(double speed, double turn) {
    XRPDrivetrain.getInstance().arcadeDrive(speed, turn);
  }

  private void driveForward() {
    drive(0.75, 0);
  }

  private void driveReverse() {
    drive(-0.75, 0);
  }

  private void stop() {
    drive(0, 0);
  }

  // Controller functions
  private boolean getZButton() {
    return KeyboardController.getInstance().getZButton();
  }
}

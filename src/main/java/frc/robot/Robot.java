// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.wpilib.driverstation.POVDirection;
import org.wpilib.framework.TimedRobot;
import frc.robot.util.KeyboardController;
import frc.robot.util.XRPDrivetrain;

public class Robot extends TimedRobot {
  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {
    // TODO: Replace this code or delete it altogether for the training
    // drive(-getWSAxis(), -getADAxis());

    if (getZButton()) {
      driveForward();
    } else if (getXButton()) {
      driveReverse();
    } else if (getCButton()) {
      drive(0, 0.75);
    } else if (getVButton()) {
      drive(0, -0.75);
    } else {
      stop();
    }
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

  // ================ CONTROLLER FUNCTIONS ========================
  private boolean getZButtonPressed() {
      return KeyboardController.getInstance().getRawButtonPressed(0);
  }
  
  private boolean getZButton() {
    return KeyboardController.getInstance().getZButton();
  }

  private boolean getZButtonReleased() {
      return KeyboardController.getInstance().getRawButtonReleased(0);
  }

  private boolean getXButtonPressed() {
      return KeyboardController.getInstance().getRawButtonPressed(1);
  }
  
  private boolean getXButton() {
      return KeyboardController.getInstance().getRawButton(1);
  }

  private boolean getXButtonReleased() {
      return KeyboardController.getInstance().getRawButtonReleased(1);
  }

  private boolean getCButtonPressed() {
      return KeyboardController.getInstance().getRawButtonPressed(2);
  }
  
  private boolean getCButton() {
      return KeyboardController.getInstance().getRawButton(2);
  }

  private boolean getCButtonReleased() {
      return KeyboardController.getInstance().getRawButtonReleased(2);
  }

  private boolean getVButtonPressed() {
      return KeyboardController.getInstance().getRawButtonPressed(3);
  }
  
  private boolean getVButton() {
      return KeyboardController.getInstance().getRawButton(3);
  }

  private boolean getVButtonReleased() {
      return KeyboardController.getInstance().getRawButtonReleased(3);
  }

  private POVDirection getPOV() {
    return KeyboardController.getInstance().getPOV();
  }

  private double getADAxis() {
      return KeyboardController.getInstance().getRawAxis(0);
  }

  private double getWSAxis() {
      return KeyboardController.getInstance().getRawAxis(1);
  }

  private double getERAxis() {
      return KeyboardController.getInstance().getRawAxis(2);
  }

  
}

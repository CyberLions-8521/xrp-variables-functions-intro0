// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

import edu.wpi.first.wpilibj.GenericHID;

/** A custom utility wrapper to handle keyboard inputs as a GenericHID for simulation. */
public class KeyboardController extends GenericHID {
    // NOTE: Singletons are NOT recommended; this is only done to reduce
    // boilerplate code in Robot.java for the intro workshops 
    private static final KeyboardController m_instance = new KeyboardController(0);
    public static KeyboardController getInstance() { return m_instance; }

    private KeyboardController(int port) {
        super(port);
    }
    
    /**
     * WS - Axis 1
     * AD - Axis 0
     * ER - Axis 2
     * NUMPAD - POV[0]
     * ZXCV - Buttons 0 through 3
     * 
     * To make buttons correspond to a joystick, you must edit the values
     * within simgui-ds.json. The values of each key correspond to those
     * found at https://oprypin.github.io/crystal-imgui/ImGui/ImGuiKey.html
     */

    public boolean getZButtonPressed() {
        return this.getRawButtonPressed(0);
    }
    
    public boolean getZButton() {
        return this.getRawButton(0);
    }

    public boolean getZButtonReleased() {
        return this.getRawButtonReleased(0);
    }

    public boolean getXButtonPressed() {
        return this.getRawButtonPressed(1);
    }
    
    public boolean getXButton() {
        return this.getRawButton(1);
    }

    public boolean getXButtonReleased() {
        return this.getRawButtonReleased(1);
    }

    public boolean getCButtonPressed() {
        return this.getRawButtonPressed(2);
    }
    
    public boolean getCButton() {
        return this.getRawButton(2);
    }

    public boolean getCButtonReleased() {
        return this.getRawButtonReleased(2);
    }

    public boolean getVButtonPressed() {
        return this.getRawButtonPressed(3);
    }
    
    public boolean getVButton() {
        return this.getRawButton(3);
    }

    public boolean getVButtonReleased() {
        return this.getRawButtonReleased(3);
    }

    public double getADAxis() {
        return this.getRawAxis(0);
    }

    public double getWSAxis() {
        return this.getRawAxis(1);
    }

    public double getERAxis() {
        return this.getRawAxis(2);
    }
}
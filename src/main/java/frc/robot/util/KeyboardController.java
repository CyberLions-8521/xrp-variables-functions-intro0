// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

import edu.wpi.first.wpilibj.GenericHID;

/** Add your docs here. */
public class KeyboardController extends GenericHID {
    /**
     * WS - Axis 1
     * AD - Axis 0
     * ER - Axis 2
     * NUMPAD - POV[0]
     * ZXCV - Buttons 0 through 3
     */

    // NOTE: Singletons are NOT recommended; this is only done to reduce
    // boilerplate code in Robot.java for the intro workshops 
    private static final KeyboardController m_instance = new KeyboardController(0);
    public static KeyboardController getInstance() { return m_instance; }

    private KeyboardController(int port) {
        super(port);
    }

    // TODO: Add more functions as needed to make an intuitive "controller"
    public boolean getZButton() {
        return super.getRawButton(1);
    }
}

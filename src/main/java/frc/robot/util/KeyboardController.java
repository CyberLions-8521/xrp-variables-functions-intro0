// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

import java.util.Objects;

import org.wpilib.driverstation.DriverStation;
import org.wpilib.driverstation.GenericHID;
import org.wpilib.driverstation.HIDDevice;
import org.wpilib.util.UsageReporting;

/** Add your docs here. */
public class KeyboardController implements HIDDevice {
    // NOTE: Singletons are NOT recommended; this is only done to reduce
    // boilerplate code in Robot.java for the intro workshops 
    private static final KeyboardController m_instance = new KeyboardController(0);
    public static KeyboardController getInstance() { return m_instance; }

    private final GenericHID m_hid;

    @Override
    public GenericHID getHID() { return m_hid; }

    private KeyboardController(int port) {
        this(DriverStation.getGenericHID(port));
    }

    private KeyboardController(final GenericHID hid) {
        m_hid = Objects.requireNonNull(hid, "Provided HID object cannot be null");
        UsageReporting.reportUsage("HID", hid.getPort(), "Keyboard");
    }


    /**
     * WS - Axis 1
     * AD - Axis 0
     * ER - Axis 2
     * NUMPAD - POV[0]
     * ZXCV - Buttons 0 through 3
     */
    
    // TODO: Add more functions as needed to make an intuitive "controller"
    public boolean getZButton() {
        return m_hid.getRawButton(1);
    }
}

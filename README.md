#  🤖 XRP INTRO Day 0 🤖
## **Project Goal:**
  Preparing a XRP to be driven and controled in Java using the WPIlib IDE.
The Project should have the following: 
* A working XRP
* Connected to a PC
* Drivable 
* Controlable

## WORKSHOP 
  ### Prerequisites (Only if you aren't on Github but this is a readme so uh for docs purposes O_O )
  *  LOG INTO GITHUB
    - https://github.com/   
        - Don't Have One? Make One!
  * LOAD UP WPILIB! **On K3 PC!** 
    - IF you are using a personal device, then you have to install the needed files and that takes too long **-_-** 
    - File Explorer => This PC => Local Disk(C:) => Users => Public => wpilib => 2026 => vscode => Code (Looks Like a Blue Fish 🐟)
  * GITHUB CLONING 
    - (Don't Ask Questions 😉 JK you can but if you want to really learn how Git Works, A Later Workshop will Happen!) 
    - Go to this Link: https://github.com/CyberLions-8521/xrp-variables-functions-intro0
    - This has the Needed Files we NEED for the XRPs
    - Click on the GREEN Button called `<>Code`
    - Underneath Clone:
        - Copy the HTTPS using the Copy Button (Two Squares)
        https://github.com/CyberLions-8521/xrp-variables-functions-intro0.git
    - Go to WPILib 
        - In Explorer there should be a button called Clone Repository
        - Click it and Paste the link into the top of the search bar
        - Enter and Wait! (It needs to Load ^-^)
  ### Task 1: WROOM WROOM
  * Use the Following: 
    - `driveForward();` 
        - Drives the XRP in the Forward Direction at a Speed of 0.75
    - `driveReverse();`
        - Drives the XRP in the Reverse Direction at a Speed of 0.75
* Overall Goal:
    - Use Drive Commands to drive the XRP in a direction.
    - **NOTE** The Last One Standing Wins!
### Task 2: JAY YOU GOTTA MOVE
  * Use the Following: 
    - `driveForward();` 
        - Drives the XRP in the Forward Direction at a Speed of 0.75
    - `driveReverse();`
        - Drives the XRP in the Reverse Direction at a Speed of 0.75
    - `drive(double speed, double turn);`
        - Drives the XRP at a Given Direction at a Given Turn Given the Speed and Turn
    - `stop();`
        - Stops the XRP 
* Overall Goal:
    - Use `drive(?, ?);` to turn the Robot in a Direction.
    - **NOTE** if Forward is Positive, what is Backwards?
### Task 3: LET ME TAKE THE WHEEL
  * Use the Following: 
    - Use `getZButton()`
        - Returns whether the Z Key on the Keyboard was pressed
    - Any of the Previous Commands
        - **NOTE** The One Active Wins!
    - ```java
      if (KeyboardFunction()) {
        CommandFunction();
      }
      ``` 
        - if something happens => Do That!
    - ```java
      if (?) {
        ?
      } else if () {
        ?
      } else {
        ?
      }
      ``` 
        - if something happens => Do That! but if something didn't happen but something else=> Do Other! => If something never happened => Do This!
  * Overall Goal: 
    - Use the if statement to be able to Press a Button, that makes the robot do something!
### Challenges!
 *  Make it Fully Controlable (Buttons that goes Forward, turn left, turn right, Backward)
 *  Do a Little Dance on Command! (Spin in a Circle!)
 *  Lowkey a Super Challenge for this Workshop (Make the Robot do a Square Rotation!) **NOTE** You are going to need to look through XRPDriveTrain and ask what does a Encoder do.

### Additional Functions
| Method Signature | Description |
|---|---|
| `resetEncoders()` | Resets both left and right drive encoders to zero. |
| `getLeftDistanceInch()` | Returns the distance tracked by the left wheel encoder in inches. |
| `getRightDistanceInch()` | Returns the distance tracked by the right wheel encoder in inches. |
| `getHeading()` | Returns the current robot orientation/heading angle from the gyro in degrees. |
| `resetGyro()` | Resets the gyro heading value to zero. |
| `getServoPosition()` | Returns the current position of the servo motor between `0.0` and `1.0`. |
| `setServoPosition(double pos)` | Moves the servo to the given position between `0.0` and `1.0`. |
| `getUltrasonicInches()` | Returns the distance measured by the ultrasonic distance sensor in inches. |
| `getUltrasonicMeters()` | Returns the distance measured by the ultrasonic distance sensor in meters. |
| `getLeftReflectance()` | Returns the light reflectance reading from the left reflectance sensor. |
| `getRightReflectance()` | Returns the light reflectance reading from the right reflectance sensor. |
| `getZButtonPressed()` | Returns `true` if the 'Z' key/button was just pressed down this frame. |
| `getZButton()` | Returns `true` continuously while the 'Z' key/button is held down. |
| `getZButtonReleased()` | Returns `true` if the 'Z' key/button was just released this frame. |
| `getXButtonPressed()` | Returns `true` if the 'X' key/button was just pressed down this frame. |
| `getXButton()` | Returns `true` continuously while the 'X' key/button is held down. |
| `getXButtonReleased()` | Returns `true` if the 'X' key/button was just released this frame. |
| `getCButtonPressed()` | Returns `true` if the 'C' key/button was just pressed down this frame. |
| `getCButton()` | Returns `true` continuously while the 'C' key/button is held down. |
| `getCButtonReleased()` | Returns `true` if the 'C' key/button was just released this frame. |
| `getVButtonPressed()` | Returns `true` if the 'V' key/button was just pressed down this frame. |
| `getVButton()` | Returns `true` continuously while the 'V' key/button is held down. |
| `getVButtonReleased()` | Returns `true` if the 'V' key/button was just released this frame. |
| `getPOV()` | Returns the D-pad/POV angle value from the controller in degrees. |
| `getADAxis()` | Returns the value of the A/D key axis (typically horizontal steering input). |
| `getWSAxis()` | Returns the value of the W/S key axis (typically vertical throttle input). |
| `getERAxis()` | Returns the value of the E/R key axis (typically secondary controller axis input). |




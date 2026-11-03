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
    - ` if (KeyboardFunction()) { CommandFunction(); }` 
        - if something happens => Do That!
    - ` if (?) { ? } else if () { ? } else { ? } ` 
        - if something happens => Do That! but if something didn't happen but something else=> Do Other! => If something never happened => Do This!
  * Overall Goal: 
    - Use the if statement to be able to Press a Button, that makes the robot do something!
### Challenges!
 *  Make it Fully Controlable (Buttons that goes Forward, turn left, turn right, Backward)
 *  Do a Little Dance on Command! (Spin in a Circle!)
 *  Lowkey a Super Challenge for this Workshop (Make the Robot do a Square Rotation!) **NOTE** You are going to need to look through XRPDriveTrain and ask what does a Encoder do.




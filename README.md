#  🤖 **XRP INTRO Day 1** (11/10) 🤖
## **Quick Note**
  Dear Programmers! I apologize that I can't make it to today's workshop to see your wonderful hands work. However, you have other mentors such as Ethan Nguyen , Mr. Vu, and Mr. Schrier to help you if you need. This Workshop will be what I dub, a freelancer's Workshop where you are free to hop onto any of the challenges we have set for you! 
   -- Kevin On
## **Project Goal:**
  * A Branch on Github with your Code!
  * Any of the Challenges completed!
  * Whatever You Desire from XRPs with the Starter Code
    - Fully Controlled (Pro)
    - Encoders (Hacker)
    - Functions (God)
  

## WORKSHOP 
  ### Prerequisites (Reminder from Last Workshop on Thursday)
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
        - https://github.com/CyberLions-8521/xrp-variables-functions-intro0.git
    - Go to WPILib (Make sure that there is a red and white logo in the top right (We are not using base VSCODE))
        - In Explorer (Two Papers) there should be a button called Clone Repository
        - Click it and Paste HTTPS from before into the top of the search bar
        - Enter and Wait! (It needs to Load ^-^)
    ### Github Branches!
    - New Stuff (IF you want to save your code for a later date and also practice for when you work with github!):
      - Create a Branch and Save Code! (2 Methods -> Github Way vs Git Way)
        - Github Way:
          - Make a Branch in Github
            - Click on the "main button" this shows the current branch you are looking at. Please do not commit to main, if you do we can always revert so its ok. 
            - Click on View All Branches 
            - Click on the GREEN "New Branch" Button
            - Name and select your Source Code (The Code your branch originates from) (Put a conventional Name like Name-2026 or Name-Main)
            - In your WPILIB, go to terminal (if its not up -> top right with the square that has a line on its bottom)
            - If you can't edit in it, press the + to open another terminal or delete using the trashcan and reopen it.
            - Input `git fetch origin` Enter (Syncs Github to your Terminal)
            - Input `git switch <branch-name>` (switches to your created branch)
        - Git Way:
            - `git switch -c <branch-name>` (-c means to create and you switch to your branch)
            - `git push -u origin <branch-name>` (pushes it to your branch on the repo)
        - Commit
            - Input `git add .` or `git add --all` (To stage all your changes)
            - Input `git commit -m "your message"` (To commit your changes, add a message like what did you do (Be a little profesh))
            - Input `git push` (Sends that Baby to your branch!)
            - `git branch` to check if you are on that branch :)

### Challenges!
  - **Fully controllable using Keyboard Controls or WASD Functions (See Code Logic Below)**
     ```java
      if (getZButton()) {
        driveForward();
      } else if (getXButton()) {
        driveReverse();
      } else {
        stop();
      }
  - if something happens => do that thing else do something else
    - You can chain these using else if and a boolean statement aka true or false
    - if you are thinking about using WASD functions using lesser / greater than < or >, because W = positive and S = negative
    - See Functions Below
  - **Drive to a certain distance using 👻 MATH 👻**
    - Using Encoders aka a built in distance tracker within in the XRP
    - Use `resetEncoders()` when you want to reset the distance  
    - Use `getLeftDistanceInch()` or `getRightLeftDistance()` to get the distances in inches
    - Use a if statement to stop the Robot at a certain distance
  - **Make it do a little dance using one Line!**
    - String up a several lines of code and put it into a function!
    ```java 
      private void FunctionName() {
        // Insert your Code!
      }
  - a Function condenses your Code into a singular line and can be called through `FunctionName();`
  - This will call that function and whatever inside of it!

##  Drive Functions

Functions used to control the movement of the robot.

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `drive(speed, turn)` | `double speed`, `double turn` | `void` | Moves the robot using arcade drive. `speed` controls forward/backward (-1.0 to 1.0) and `turn` controls rotation (-1.0 to 1.0). |
| `driveForward()` | *None* | `void` | Drives the robot straight forward at 75% speed. |
| `driveReverse()` | *None* | `void` | Drives the robot straight backward at 75% speed. |
| `stop()` | *None* | `void` | Stops all drivetrain movement immediately. |

---

## Sensor & Actuator Functions

Functions used to read telemetry from sensors or control actuators (servos).

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `resetEncoders()` | *None* | `void` | Resets the wheel encoders back to zero. |
| `getLeftDistanceInch()` | *None* | `double` | Gets total distance traveled by the left wheel in inches. |
| `getRightDistanceInch()` | *None* | `double` | Gets total distance traveled by the right wheel in inches. |
| `getHeading()` | *None* | `double` | Returns the current gyro heading angle in degrees. |
| `resetGyro()` | *None* | `void` | Resets the gyro angle reading back to 0 degrees. |
| `getServoPosition()` | *None* | `double` | Returns the current position of the connected servo. |
| `setServoPosition(pos)` | `double pos` | `void` | Sets the servo position (`0.0` to `1.0`). |
| `getUltrasonicInches()` | *None* | `double` | Reads the distance from the ultrasonic sensor in inches. |
| `getUltrasonicMeters()` | *None* | `double` | Reads the distance from the ultrasonic sensor in meters. |
| `getLeftReflectance()` | *None* | `double` | Reads the light reflectance value from the left line-following sensor. |
| `getRightReflectance()` | *None* | `double` | Reads the light reflectance value from the right line-following sensor. |

---

## Keyboard Controller Functions

Functions used to capture keypresses and joystick input from the keyboard controller.

### Action Buttons (Z, X, C, V)

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `getZButtonPressed()` | *None* | `boolean` | `true` only on the initial frame when **Z** key is pressed down. |
| `getZButton()` | *None* | `boolean` | `true` as long as the **Z** key is held down. |
| `getZButtonReleased()` | *None* | `boolean` | `true` only on the frame when **Z** key is released. |
| `getXButtonPressed()` | *None* | `boolean` | `true` only on the initial frame when **X** key is pressed down. |
| `getXButton()` | *None* | `boolean` | `true` as long as the **X** key is held down. |
| `getXButtonReleased()` | *None* | `boolean` | `true` only on the frame when **X** key is released. |
| `getCButtonPressed()` | *None* | `boolean` | `true` only on the initial frame when **C** key is pressed down. |
| `getCButton()` | *None* | `boolean` | `true` as long as the **C** key is held down. |
| `getCButtonReleased()` | *None* | `boolean` | `true` only on the frame when **C** key is released. |
| `getVButtonPressed()` | *None* | `boolean` | `true` only on the initial frame when **V** key is pressed down. |
| `getVButton()` | *None* | `boolean` | `true` as long as the **V** key is held down. |
| `getVButtonReleased()` | *None* | `boolean` | `true` only on the frame when **V** key is released. |

### Analog Axes & D-Pad

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `getWSAxis()` | *None* | `double` | Returns axis value for **W** (forward) / **S** (reverse) keys (`-1.0` to `1.0`). |
| `getADAxis()` | *None* | `double` | Returns axis value for **A** (left) / **D** (right) keys (`-1.0` to `1.0`). |
| `getERAxis()` | *None* | `double` | Returns axis value for **E** / **R** keys (`-1.0` to `1.0`). |
| `getPOV()` | *None* | `int` | Returns the current POV angle in degrees (e.g., `0`, `90`, `180`, `270`), or `-1` if centered. |




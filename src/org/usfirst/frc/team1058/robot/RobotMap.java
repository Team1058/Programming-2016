package org.usfirst.frc.team1058.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    public static int leftMotorOne = 8;
    public static int leftMotorTwo = 7;
    public static int rightMotorOne = 3;
    public static int rightMotorTwo = 2;
    public static int intakeRollerCANTalon = 6;
    public static int intakeAngleCANTalon = 1;
    public static int climberWinch = 4;
    
    
    
    public static int shooterSolenoidChannel = 3;
    public static int climberExtendSolenoidChannel = 2;
    public static int climberHookSolenoidChannel = 1;
    public static int driveBaseShiftSolenoid = 0;
    public static int shooterSolenoidChannel2 = 4;
    public static int flashlightChannel = 6;
}

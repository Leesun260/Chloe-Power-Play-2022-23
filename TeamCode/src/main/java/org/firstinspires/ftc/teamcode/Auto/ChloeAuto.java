package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Common.Hardware;

@Autonomous(name="ChloeAuto", group ="Auto") //Creates a new opmode. (name of opmode, name of group)
// Auto(sequential): public abstract class "name" extend LinearOpMode
//Telop(recursive): public abstract class "name" extend OpMode
public abstract class ChloeAuto extends LinearOpMode { // Linear opmode means once u finish code u exit it. regular opmode means you continuously go in a loop
    // abstract class means you can't have child classes
    Hardware robot = new Hardware();
    private ElapsedTime runtime = new ElapsedTime(); // ElapsedTime is a built in class used for timers


    public void runOpMode(){
        robot.init(hardwareMap);// hardwareMap is provided by the FTC SDK, and its associated with this opmode. When the opmode is selected, then the hardware map is stored as "hardwareMap"
        waitForStart();//waiting for players to hit init/play button on driver hub
        runtime.reset();// resets time to 0

        while (opModeIsActive()) {// opMode is activated for the time less than 30 sec or whatever time set (time set for opMode)
            while (runtime.seconds() <= 5) {
                robot.lf.setPower(1);
                robot.lb.setPower(1);
                robot.rf.setPower(1);
                robot.rb.setPower(1);
            }

            robot.lf.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE); //counteracts the momentum by pushing back, allowing the robot to completely stop where u want it to stop
            robot.lb.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE); // newtons's 2nd laww wowww
            robot.rf.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
            robot.rb.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        }

    }
}
//learn about clicks --> measuring by distance instead of time (research clicks in motors; clicks/second

package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Common.Hardware;

@Autonomous(name="BlueAuto", group ="Auto") //Creates a new opmode. (name of opmode, name of group)
// Auto(sequential): public abstract class "name" extend LinearOpMode
//Telop(recursive): public abstract class "name" extend OpMode
public abstract class BlueAuto extends LinearOpMode { // Linear opmode means once u finish code u exit it. regular opmode means you continuously go in a loop
    // abstract class means you can't have child classes
    Hardware robot = new Hardware();
    final double CLICKSPERINCH = 537/10.0;
    private ElapsedTime runtime = new ElapsedTime(); // ElapsedTime is a built in class used for timers
    AutoHub dipatch;


    public void runOpMode(){
        dipatch = new AutoHub(this);
        robot.init(hardwareMap);// hardwareMap is provided by the FTC SDK, and its associated with this opmode. When the opmode is selected, then the hardware map is stored as "hardwareMap"
        waitForStart();//waiting for players to hit init/play button on driver hub
        runtime.reset();// resets time to 0
        dipatch.RunForInches(10);



    }





}
//learn about clicks --> measuring by distance instead of time (research clicks in motors; clicks/second

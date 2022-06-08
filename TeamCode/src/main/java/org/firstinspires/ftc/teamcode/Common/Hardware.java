package org.firstinspires.ftc.teamcode.Common;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardware { //all objects we need
    public DcMotorEx lf =null; // declaring motors
    public DcMotorEx lb =null;// assign to null (none) because motors not detected yet. It has nothing to access in the beginning (robot is off and not connected)
    public DcMotorEx rf =null;
    public DcMotorEx rb =null;

    public Servo intake =null; //range -1 to 1 (cannot rotate 360)
    public CRServo continuousServo =null; // continuous non stop (no limit?) can rotate 360

    // access hardware map on drive station:
    HardwareMap access = null;

    public Hardware(){ //empty constructor (defult)
    }
    // code below plays once the driver hub is initialized
    public void init(HardwareMap hwMapP){ // void: doesn't affect code (basically a method like print unlike return that affects code
        access = hwMapP; // this is a void because it is in the same class so it doesn't affect anything

        lf = access.get(DcMotorEx.class, "left_back"); //class.method
        lb = access.get(DcMotorEx.class, "left_front");// we can name these motors whatever we want :)))
        rf = access.get(DcMotorEx.class, "right_front"); // these strings must always match what is named in the driver hub
        rb = access.get(DcMotorEx.class, "right_back");

        intake = access.get(Servo.class, "intake");
        continuousServo = access.get(CRServo.class, "360 servo");
        //intake is automatically 0, no need to set
        continuousServo.setPower(0);
        lf.setPower(0);
        lb.setPower(0);
        rf.setPower(0);
        rb.setPower(0);

        //directions for motors
        lf.setDirection(DcMotorEx.Direction.REVERSE);
        lb.setDirection(DcMotorEx.Direction.REVERSE);
        rf.setDirection(DcMotorEx.Direction.REVERSE);
        rb.setDirection(DcMotorEx.Direction.REVERSE);// no actual data type for direction. Direction has 2 states: froward and reverse

        lf.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        lb.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        rb.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        rf.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
    }
}

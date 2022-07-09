package org.firstinspires.ftc.teamcode.Auto;

import org.firstinspires.ftc.teamcode.Common.Hardware;
import org.firstinspires.ftc.teamcode.Auto.ConstantHeading;

public class ConstantHeadingDrive {

    static final double COUNTS_PER_MOTOR_REV = 537.7;
    static final double MAX_VELOCITY_DR = 2700;
    static final double DRIVE_GEAR_REDUCTION = 1.0;
    static final double WHEEL_DIAMETER_INCHES = (96.0 / 25.4);
    static final double COUNTS_PER_INCH = 0;

    Hardware hw = new Hardware();
    ConstantHeading ConstHead = new ConstantHeading();

    public void Drive(double power, double x, double y){

        ConstHead.setTarget(x, y);

        double addPose = (ConstHead.getxVector() + ConstHead.getyVector());



    }

}


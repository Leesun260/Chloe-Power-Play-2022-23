package org.firstinspires.ftc.teamcode.Auto;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Common.Hardware;

public class AutoHub {
    LinearOpMode linear;
    Hardware robot;
    HardwareMap hardwareMap;
    final double CLICKSPERINCH = 537/10.0;
    private ElapsedTime runtime = new ElapsedTime();

    public AutoHub(LinearOpMode plinear){
        linear = plinear;
        hardwareMap = linear.hardwareMap;

        robot = new Hardware();
        robot.init(hardwareMap);

    }

    public void RunForInches(int inches){
        int lfEV = robot.lf.getCurrentPosition();
        int lbEV = robot.lb.getCurrentPosition();
        int rfEV = robot.rf.getCurrentPosition();
        int rbEV = robot.rb.getCurrentPosition();
        int distance = inches * (int) CLICKSPERINCH;

        robot.lf.setTargetPosition(lfEV + distance);
        robot.lb.setTargetPosition(lbEV + distance);
        robot.rf.setTargetPosition(rfEV + distance);
        robot.rb.setTargetPosition(rbEV + distance);
        while (linear.opModeIsActive() && robot.lf.isBusy() && robot.rf.isBusy() && robot.lb.isBusy() && robot.rb.isBusy()){
            robot.lf.setPower(1);
            robot.lb.setPower(1);
            robot.rf.setPower(1);
            robot.rb.setPower(1);
        }
        robot.lf.setPower(0);
        robot.lb.setPower(0);
        robot.rf.setPower(0);
        robot.rb.setPower(0);

        public void RunFor5Seconds(int secondss) {
            while (linear.opModeIsActive()) {// opMode is activated for the time less than 30 sec or whatever time set (time set for opMode)
                while (runtime.seconds() <= secondss) {
                    robot.lf.setPower(1);
                    robot.lb.setPower(1);
                    robot.rf.setPower(1);
                    robot.rb.setPower(1);

                }  robot.lf.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE); //counteracts the momentum by pushing back, allowing the robot to completely stop where u want it to stop
                robot.lb.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE); // newtons's 2nd laww wowww
                robot.rf.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
                robot.rb.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
            }
        }

        public void Turn (){ //homework: create a turn method that moves in a box 
            robot.
        }
}



package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Common.Hardware;

abstract public class BaseDrive extends OpMode {

    Hardware robot = new Hardware();

    @Override // overrride means this is the new code, literally just override the past objects with the same name
    public void init(){ // this is the only thing from Hardware class
        robot.init(hardwareMap); // allowing robot to start after it is connected to the robot and it is ready
    }
    @Override
    public void init_loop(){//Execute Command to Initialize Robot
        // change hsv, etc
    }
    @Override
    public void start(){
    }
    @Override // teleop loop if statement
    public void loop(){

        MoveDT();
        //bulk of code
        // a lot of object oriented programming
        // throughout whole teleop mode we are going to set the power to 1 --> IF STATEMENT!!
        if (gamepad1.a){
            robot.lf.setPower(1);
            robot.rf.setPower(1);
            robot.lb.setPower(1);
            robot.rb.setPower(1);

        }
        else{// stops the robot if no button is being pressed (good safety measure and just common sense.)
            robot.lf.setPower(0);
            robot.rf.setPower(0);
            robot.lb.setPower(0);
            robot.rb.setPower(0);
        }

        if (gamepad2.b){
            robot.lf.setPower(1);

        }
        else{
            robot.lf.setPower(0);

        }

    }

    public void MoveDT() {
        if (gamepad2.b) {
            robot.lf.setPower(1);
            robot.rf.setPower(1);
            robot.lb.setPower(1);
            robot.rb.setPower(1);

        } else {// stops the robot if no button is being pressed (good safety measure and just common sense.)
            robot.lf.setPower(0);
            robot.rf.setPower(0);
            robot.lb.setPower(0);
            robot.rb.setPower(0);
        }


        // OR you can do this ---->

    }

    public void MoveDTjoy () {

        robot.lf.setPower(gamepad2.left_stick_y);
        robot.rf.setPower(gamepad2.left_stick_y);
        robot.lb.setPower(gamepad2.left_stick_y);
        robot.rb.setPower(gamepad2.left_stick_y);

    }

    public void MoveDTturn (){

        robot.lf.setPower(gamepad2.right_stick_x);
        robot.rf.setPower(-gamepad2.right_stick_x);// negative because it has to be opposite directions while turning
        robot.lb.setPower(gamepad2.right_stick_x);
        robot.rb.setPower(-gamepad2.right_stick_x);

    }

    public void MoveDTtogether (){
        robot.lf.setPower(gamepad2.left_stick_y + gamepad2.right_stick_x);
        robot.rf.setPower(gamepad2.left_stick_y - gamepad2.right_stick_x);// negative because it has to be opposite directions while turning
        robot.lb.setPower(gamepad2.left_stick_y + gamepad2.right_stick_x);
        robot.rb.setPower(gamepad2.left_stick_y -gamepad2.right_stick_x);

    }





    }





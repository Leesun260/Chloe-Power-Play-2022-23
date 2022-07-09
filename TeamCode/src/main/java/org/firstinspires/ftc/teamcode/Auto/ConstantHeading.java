package org.firstinspires.ftc.teamcode.Auto;


public class ConstantHeading {

    double x = 0;
    double y = 0;
    double distance = 0;
    double xVector = 0;
    double yVector = 0;

    public ConstantHeading(){

    }

    public void setTarget(double d, double h){
        x = d;
        y = h;
    }

    public double getDistance(){
        distance = Math.sqrt(Math.pow(x,2)+ Math.pow(y,2));
        return distance;
    }

    public void coordinateToVector(){
        xVector = x / distance;
        yVector = y / distance;
    }

    public double getxVector(){
        return xVector;
    }

    public double getyVector(){
        return yVector;
    }

}

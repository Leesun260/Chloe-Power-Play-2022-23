package org.firstinspires.ftc.teamcode.Common;

class person {
     public int hair;
     public int moles;
     public int eye;

    public person(int x, int y, int z){
        hair = x;
        moles = y;
        eye = z;
    }

    int getHair(){
        return hair;
    }

    public void setHair(int h){
        hair = h;
    }

};

  public class people {

      person Brianna = new person(3, 4, 6);
      person Chris = new person(0, 1, 4);
      int chrisHair = Chris.getHair();
      int briannaHair = Brianna.getHair();
      Brianna.setHair(100000);
      Chris.setHair(9878654675545647586754564758475645678);
  }










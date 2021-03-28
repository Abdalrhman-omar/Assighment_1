package com.PointTest;

public class Point {
    private float xcoord, ycoord, xcoord_m, ycoord_p, xcoord_p, ycoord_m;

    public Point(float xcoord, float ycoord) {
        this.xcoord = xcoord;
        this.ycoord = ycoord;


    }
    public Point() {
        this.xcoord = 0;
        this.ycoord = 0;


    }

    public float getXcoord() {
        return xcoord;
    }

    public float getYcoord() {
        return ycoord;
    }

    public void setXcoord(float xcoord) {
        this.xcoord = xcoord;
    }

    public void setYcoord(float ycoord) {
        this.ycoord = ycoord;
    }
//    public void 	middle_point(float xcoord_m,float ycoord_m,float ycoord_p,float xcoord_p){
//
//
//        float [] the_middle_point = new float[0];
//
//        float yacces=ycoord_p+ycoord_m/2;
//        float xacces= xcoord_m+xcoord_p/2;
//        the_middle_point[0]=xacces;
//        the_middle_point[1]=yacces;
//        System.out.println("the middle point is "+the_middle_point);
//
//
//
//    }
public void 	middle_point(Point first,Point sacound){


    float [] the_middle_pointnew ;

    float yacces=first.ycoord+sacound.ycoord/2;
    float xacces= first.xcoord+sacound.xcoord/2;
    float [] the_middle_point={xacces,yacces};

    System.out.println("the middle point is ("+the_middle_point [0]+","+the_middle_point[1]+")");



}
public void Which_quarter_in_Cartesian(Point which_quarter_in_Cartesian){
    if (this.ycoord < 0 && this.xcoord<0){
        System.out.println("Quarter  1");
    }
    if (this.ycoord > 0 && this.xcoord>0){
        System.out.println("Quarter  3");
    }
    if (this.ycoord > 0 && this.xcoord<0){
        System.out.println("Quarter  2");
    }
    if (this.ycoord < 0 && this.xcoord>0){
        System.out.println("Quarter  4");
    }





}

}

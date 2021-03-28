package com.PointTest;

public class PointTest {
    public static void main(String[] args) {
    Point a =new Point(8,8);
        Point b =new Point(2,2);
        Point the_middle_obj = new Point();
        the_middle_obj.middle_point(a,b);
        Point which_quarter_in_Cartesian_obj = new Point(5,-5);
        which_quarter_in_Cartesian_obj.Which_quarter_in_Cartesian(which_quarter_in_Cartesian_obj);
        a.Which_quarter_in_Cartesian(a);
    }
}

package geometry.shape2d;

import geometry.interfaces.*;

public class Circle implements calcArea, calcPerimeter{
    public double radius;
    public Circle (double r){
      radius= r;
    }
    public double area(){
        return Math.PI*radius*radius;

    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
}
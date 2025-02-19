package geometry.shape2d;

import geometry.interfaces.*;

public class Rectangle implements calcArea, calcPerimeter{
    public double len, wid;

    public Rectangle(double l,double w){
        len = l;
        wid= w;
    }
    public double area(){
        return len*wid;

    }
    public double perimeter(){
        return 2*(len+wid);
    }
}
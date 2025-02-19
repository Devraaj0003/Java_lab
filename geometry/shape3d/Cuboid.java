package geometry.shape3d;

import geometry.shape2d.Rectangle;

public class Cuboid extends Rectangle{
    public double height;
    public Cuboid (double l, double w, double h){
        super(l,w);

        height= h;
    }
    public double volume(){
        return area()*height;

    }
   
}
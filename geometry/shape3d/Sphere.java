package geometry.shape3d;

import geometry.shape2d.Circle;

public class Sphere extends Circle{
   
    public Sphere (double r){
        super(r);
    }
    public double volume(){
        return (4/3.0)*Math.PI*Math.pow(radius, 3);

    }
   
}
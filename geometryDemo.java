
import geometry.shape3d.*;



public class geometryDemo{
    public static void main(String a[]){
        Cuboid c = new Cuboid (2,3,4);
        Sphere s = new Sphere(10);
        System.out.print("Area: "+c.area()+"\nPerimeter: "+c.perimeter()+"\nVolume: "+c.volume());
        System.out.print("Area: "+s.area()+"\nPerimeter: "+s.perimeter()+"\nVolume: "+s.volume());
    }
}


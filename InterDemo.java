/*create an interface with function area() and perimeter()  
 create two classe circle abd rectangle which implements the above interface.
 create a menu driven program to find area and perimeter of various objects */


import java.util.*;
interface FindArea
{
    public  void area();
    public  void perimeter();
}
class Rectangle implements FindArea
{
   int l,b;
   Rectangle(int a,int c)
   {
    l=a;
    b=c;
   }
   public void  area()
   {
    System.out.println(l*b);
   }
   public void perimeter()
   {
    System.out.println(2*(l+b));
   }
}
class Circle implements FindArea
{
   int r;
   Circle(int a)
   {
    r=a;
    
   }
   public void area()
   {
    System.out.println( 3.14*r*r);
   }
   public void  perimeter()
   {
     System.out.println( 2*3.14*r);
   }
}
class InterDemo
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        Rectangle r=new Rectangle(10,9);
        Circle c=new Circle(3);
        while(true)
        {
        System.out.println("Enter the choice");
        System.out.println("------------------------");
        System.out.println("(1)-> Rectangele\n(2)-> Circle\n(3)-> EXIT\n\n");
        int a=s.nextInt();
        switch(a)
        {
            case 1:r.area();
            break;
            case 2:c.area();
            break;
            case 3: System.exit(0);
            default:System.out.println("This is Wrong");
        }
        }

}
}

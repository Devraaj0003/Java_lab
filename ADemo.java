import arithmetic.*;
public class ADemo 
{
    public static void main(String arg[])
    {
        Mul h=new Mul(3,3);
        Add x=new Add(3,3);
        Sub s=new Sub(3,3);
        System.out.println("add="+x.calculate()+"\n sub="+s.calculate()+"\nmul="+h.calculate());
    }
}
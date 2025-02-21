package arithmetic;
public class Add implements computable
{    
    public double x,y;
    public Add(int a,int b)
    {
        x=a;
        y=b;
    }
    public double  calculate()
    {
        return x+y;
    }
}

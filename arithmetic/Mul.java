package arithmetic;

public class Mul implements computable {
   public double x;
   public double y;

   public Mul(int var1, int var2) {
      this.x = (double)var1;
      this.y = (double)var2;
   }

   public double calculate() {
      return this.x * this.y;
   }
}

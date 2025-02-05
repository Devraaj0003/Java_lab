class Cpu {

  int price;

  public Cpu(int p) {
    this.price = p;
  }

  public void displayCpu() {
    System.out.println(price);
  }

  class Processor {

    int cores;
    String manu;

    public Processor(int c, String m) {
      cores = c;
      manu = m;
    }

    public void displayPro() {
      System.out.println(cores + " " + manu);
    }
  }

  static class Ram {

    int memory;
    String manuf;

    public Ram(int mem, String m) {
      memory = mem;
      manuf = m;
    }

    public void displayRam() {
      System.out.println(memory + " " + manuf);
    }
  }
}

public class CpuDemo {

  public static void main(String[] args) {
    Cpu c = new Cpu(40000);
    Cpu.Processor pr = c.new Processor(4, "intel");
    Cpu.Ram ram = new Cpu.Ram(8, "DDRD4");

    c.displayCpu();
    pr.displayPro();
    ram.displayRam();
  }
}

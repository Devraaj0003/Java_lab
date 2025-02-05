class Zoo {

  String name;
  String []encl;

  public Zoo(String name, String []encl) {
    this.name = name;
    this.encl = encl;
  }

  public void display1() {
    System.out.println(name);
    for(String x : encl)
        System.out.println(x);
  }


  class Enclosure {

    String name;
    String type;
    String []animals;

    public Enclosure(String n, String t, String []a) {
      name = n;
      type = t;
      animals = a;
    }

    public void display2() {
      System.out.println(name + " " + type);
      for(String x : animals)
          System.out.println(x);
    }
  }

  static class ZooInfo {

    String addr;
    String phno;

    public ZooInfo(String a, String p) {
      addr = a;
      phno = p;
    }

    public void display3() {
      System.out.println(addr + " " + phno);
    }
  }
}

public class ZooDemo {

  public static void main(String[] args) {

    String enclosure[] = {"Area-1", "Area-2", "Area-3"};
    String an[] = {"Zebra", "Giraffe"};
    
    Zoo z = new Zoo("TVM Zoo", enclosure);
    Zoo.Enclosure en = z.new Enclosure("Grassland", "Outdoor", an);
    Zoo.ZooInfo info = new Zoo.ZooInfo("Thrissur", "123456789");

    z.display1();
    en.display2();
    info.display3();
  }
}

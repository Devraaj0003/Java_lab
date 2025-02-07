
class Animal{
    private String species;
    int age;
    float weight;
    protected String color;
    
    public Animal(String species, int age, float weight, String color){
        this.species = species;
        this.age= age;
        this.weight = weight;
        this.color = color;

    }
    public void displayAnimal(){
        System.out.println(age+" "+weight+" kg" +species+ " in "+color);

    }
}
class Dog extends Animal{
private String name;
private String owner;
public Dog (String species, int age, float weight, String color, String name, String owner){
    super(species, age, weight, color);
    this.name =name;
    this.owner = owner;
}
public void displayDog(){
    System.out.println(name+ "owned by "+owner);
}


}

public class AnimalDemo{
    public static void main(String []args){
        Dog d  = new Dog ("Mammal",2,10, "brown", "Jim","Dev");
        d.displayAnimal();
        d.displayDog();
    }
}
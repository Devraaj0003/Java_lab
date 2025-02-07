import java.util.Scanner;

class Person{
    String name;
    int age;
    String gender;
    String add;
  
    
    public Person(String name, String gender,int age,String add){
        this.name = name;
        this.gender = gender;
        this.age= age;
        this.add = add;

    }
    public void displayPerson(){
        System.out.println(name+" "+gender+" " +age+ " in "+add);

    }
}
class Employee extends Person{

int empid;
String c_name;
String qualification;
int salary;
public Employee (String name, String gender,int age,String add, int empid,String c_name, String qualification,int salary){
    super(name,gender,age, add);
    
    this.empid =empid;
    this.c_name =c_name;
    this.qualification = qualification;
    this.salary = salary;
}
public void displayEmp(){
    System.out.println(empid+ " "+c_name+" "+qualification+ " "+salary);
}


}

class Teacher extends Employee{

int t_id;
String sub;
String dept;

public Teacher (String name, String gender,int age,String add, int empid, String c_name, String qualification,int salary,int t_id,String sub, String dept){
    super(name,gender,age, add, empid, c_name, qualification, salary);
    
    this.t_id = t_id;
    this.sub =sub;
    this.dept = dept;
    System.out.print("Enter t_id: ");
    t_id = sc.nextLine();
    System.out.print("Enter subject: ");
    sub = sc.nextInt();
    System.out.print("Enter department: ");
    dept = sc.nextInt();
    sc.nextLine(); 
   
    
}
public void displayTeacher(){
    System.out.println(t_id+ " "+sub+" "+dept);
}


}

public class TeacherDemo{
    public static void main(String []args){
         Scanner sc = new Scanner(System.in);
        Teacher t[] =new Teacher[5];
        for(int i = 0 ; i < 5 ; i++){
            t[i] = new Teacher(sc);
        }
        SortStud(s);
        System.out.println("___________Rank List________");
        for(int i = 0 ; i <5 ; i++){
            System.out.print("Rank ("+(i+1)+")     ");
            s[i].displayStud();
        }
        sc.close();
    }
}
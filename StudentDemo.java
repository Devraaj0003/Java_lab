import java.util.Scanner;

class Student{
    int rollno;
    String name;
    int mark;
    static int Count= 0;

    public Student(Scanner sc){
        
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter rollNo: ");
        rollno = sc.nextInt();
        System.out.print("Enter mark: ");
        mark = sc.nextInt();
        sc.nextLine(); 
        Count++;
        
    }

    public Student(int rollno, String n, int m){
        this.rollno = rollno;
        name = n;
        mark = m;
        Count++;
    }

    public void displayStud(){
        System.out.println("Roll_no: "+rollno+" Name: "+name+"  Mark: "+mark);
    }

    public static void displayCount(){
        System.out.println("No of Student: "+Count);
    }
}

public class StudentDemo{
    public static void SortStud(Student s[]){
        int n = Student.Count;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if (s[i].mark < s[j].mark) {
                    Student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
    }

    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        Student s[] =new Student[10];
        for(int i = 0 ; i < 5 ; i++){
            s[i] = new Student(sc);
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
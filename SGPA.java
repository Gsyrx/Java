package prg11;

public interface Student {
	void setName(String name);
    void setBranch(String branch );
    void setUSN(String usn);

}




package prg11;

public class Course {
	String name;
    int credits;
    float grade;  
    void setGrade(char grade){
        this.grade = grade;
    }
    public String toString(){
        return name + ":" + credits + "(" + grade +")";
    }


}




package prg11;
import java.util.Scanner;

public class Sem {
	Course[] courses = new Course[4];
    public float gradePoints;
    public int semCredits;
    public void registerCourses(){
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<4;i++){
            courses[i] = new Course();
            System.out.println("Enter the name of course "+(i+1));
            courses[i].name=sc.next();
            System.out.println("Enter number of credits");
            courses[i].credits = sc.nextInt();
            semCredits += courses[i].credits;
            if (semCredits > 30 )
                    throw new RuntimeException("Credit limit Exceeded");
        }
    }
    public void getGrades(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<4;i++){
            System.out.println("Enter the grade for course "+(i+1));
            courses[i].grade = sc.nextFloat();
        }
    }
    public void calcSGPA(){
        int totCredits = 0;
        for(int i = 0;i < 4;i++) {
            totCredits += courses[i].credits;
            gradePoints += courses[i].credits * courses[i].grade;
        }
        float sgpa = gradePoints/totCredits;
        if (sgpa > 10) throw new RuntimeException("Something is wrong, SGPA can not be more than 10");
        System.out.println("SGPA: "+ sgpa);
    }

}




package prg11;
import prg11.Sem;
public class RegisterStudent implements Student {
	String usn;
    String name;
    String branch;
    public Sem[] sem = new Sem[20];
    public RegisterStudent(String usn,String name,String branch){
        setName(name);
        setBranch(branch);
        setUSN(usn);
    }
    public void setName(String name) {
         this.name=name;
    }
    public void setBranch(String branch) {
        this.branch= branch;
    }
    public void setUSN(String usn) {
        this.usn = usn;
    }
    public void registerSem(int sem){
        this.sem[sem] = new Sem();
        this.sem[sem].registerCourses();
    }
    public void calcCGPA(){
        int i = 1;
        float totGP = 0;
        int totCr = 0;
        while(sem[i] != null){
            totGP += sem[i].gradePoints;
            totCr += sem[i].semCredits;
            i++;
        }
        System.out.println("CGPA = "+ (totGP/totCr));
    }
}





package prg11;
public class DemoStudent {
    public static void main(String[] args) {
        RegisterStudent s1 = new RegisterStudent("1","Akash","ISE");
        System.out.println("sem 1 details");
        s1.registerSem(1);
        s1.sem[1].getGrades();
        s1.sem[1].calcSGPA();
        System.out.println("sem 2 details");
        s1.registerSem(2);
        s1.sem[2].getGrades();
        s1.sem[2].calcSGPA();
        s1.calcCGPA();
    }
}

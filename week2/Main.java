import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student (175, 75, "홍길동");
        Student s2 = new Student (180, 78, "이서경");
        Student s3 = new Student (155, 49, "이영희");
        Student s4 = new Student (182, 82, "김멋사");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        compareBMI(students);

        for (int i = 0; i< students.size(); i++){
            students.get(i).printIntro();
            students.get(i).say();
        }

    }

    static void compareBMI(ArrayList<Student> s){
        int index=0;
        for (int i = 0; i<s.size()-1; i++){
            if (s.get(i).getBMI() < s.get(i+1).getBMI())
                index = i+1;
            else
                index = i;
        }

        s.remove(index);

    }
}
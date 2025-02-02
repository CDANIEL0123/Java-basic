package ref;

public class Method1 {
    public static void main(String[] args) {
        Student_ref student1 = new Student_ref(); //x001
        initStudent(student1, "학생1",15,90);

        Student_ref student2 = new Student_ref(); //x002
        initStudent(student2, "학생2",16,86);

        printStudent(student1); //참조값 x001 넘기는것
        printStudent(student2); //참조값 x002 넘기는것
    }

    static void initStudent(Student_ref student_init, String name, int age, int grade){
        student_init.name = name; //해당 주소값으로 입력받는 필드값 대입
        student_init.age = age;
        student_init.grade = grade;
    }

    static void printStudent(Student_ref student_print){ //student_print에 x001, x002가 저장되는것
        System.out.println("이름:" +student_print.name + " 나이:" +student_print.age +" 성적:" + student_print.grade);
    }
}

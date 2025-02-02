package ref;

public class Method2 {
    public static void main(String[] args) {
        Student_ref student1 = createStudent("학생1",15,90); //student1에 createstudent에서 만들고 반환한 참조값 넣어줌
        Student_ref student2 = createStudent("학생2",16,80); //student2에 createstudent에서 만들고 반환한 참조값 넣어줌

        printStudent(student1); //참조값 x001 넘기는것
        printStudent(student2); //참조값 x002 넘기는것
    }

    static Student_ref createStudent(String name, int age, int grade){
        Student_ref student = new Student_ref();
        student.name = name; //해당 주소값으로 입력받는 필드값 대입
        student.age = age;
        student.grade = grade;
        return student; //student 다 만들고 student의 참조값만 깔끔하게 반환해줌
    }


    static void printStudent(Student_ref student_print){ //student_print에 x001, x002가 저장되는것
        System.out.println("이름:" +student_print.name + " 나이:" +student_print.age +" 성적:" + student_print.grade);
    }
}
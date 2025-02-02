package class1;
/// 배열사용
public class _05_ClassStart5 {
    public static void main(String[] args) {
        _03_Student student1; //스튜던트 클래스로 변수선언 (스튜던트 타입을 받을수있는 변수를 선언하는 것)
        student1 = new _03_Student(); // 학생을 실제 메모리에 만들기, 이제 이 변수를 통해 student1 변수 사용 가능
        student1.name = "학생1"; // X001.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        _03_Student student2 = new _03_Student(); //바로 선언하면서 메모리할당하기
        //_03_Student student2 = X002; //참조주소값으로 바뀌어서 반환하는 이 코드랑 같은 격
        System.out.println(student2); //student2 객체 호출하면 항상 주소값이 반환

        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //_03_Student[] students = new _03_Student[2];
        //_03_Student[] students = new _03_Student[] {student1,student2}; // 윗라인 더 최적화
        _03_Student[] students =  {student1,student2}; // 윗라인 더 최적화

        for (int i = 0; i < students.length; i++) {
            _03_Student s = students[i];
            System.out.println("이름 : " +s.name + "나이 : " +s.age +"성적" + s.grade);
        }

        for(_03_Student s : students) { //위에 for문 더 최적화
            System.out.println("이름 : " +s.name + "나이 : " +s.age +"성적" + s.grade);
        } //iter 쓰면 자동생성됨

    }
}
